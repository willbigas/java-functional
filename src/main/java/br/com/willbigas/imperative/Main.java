package br.com.willbigas.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static br.com.willbigas.imperative.Main.Gender.FEMALE;
import static br.com.willbigas.imperative.Main.Gender.MALE;

public class Main {

	public static void main(String[] args) {
		List<Person> peoples = List.of(
				new Person("John", MALE),
				new Person("Maria", FEMALE),
				new Person("Aisha", FEMALE),
				new Person("Alex", MALE),
				new Person("Alice", FEMALE)
		);

		// Imperative approach
		System.out.println("Imperative approach");
		List<Person> females = new ArrayList<>();

		for (Person person : peoples) {
			if (FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}

		for (Person person : females) {
			System.out.println(person);
		}

		System.out.println("Declarative approach");
		// Declarative approach
		Predicate<Person> isFemale = person -> FEMALE.equals(person.gender);

		peoples.stream()
				.filter(isFemale)
				.forEach(System.out::println);
	}

	static class Person {
		private final String name;
		private final Gender gender;

		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", gender=" + gender +
					'}';
		}
	}

	enum Gender {
		MALE, FEMALE
	}
}
