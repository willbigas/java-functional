package br.com.willbigas.streams;


import java.util.List;
import java.util.function.Predicate;

import static br.com.willbigas.streams._Stream.Gender.*;


public class _Stream {

	public static void main(String[] args) {
		List<Person> peoples = List.of(
				new Person("John", MALE),
				new Person("Maria", FEMALE),
				new Person("Aisha", FEMALE),
				new Person("Alex", MALE),
				new Person("Alice", FEMALE),
				new Person("Bob", PREFER_NOT_TO_SAY)
		);

//		Function<Person, String> personStringFunction = person -> person.name;
//		ToIntFunction<String> stringToIntFunction = name -> name.length();
//		IntConsumer println = System.out::println;
//
//		peoples.stream()
//				.map(personStringFunction)
//				.mapToInt(stringToIntFunction)
//				.forEach(println);


		Predicate<Person> personPredicate = person -> PREFER_NOT_TO_SAY.equals(person.gender);

		boolean containsOnlyFemales = peoples.stream()
				.noneMatch(personPredicate);
		System.out.println(containsOnlyFemales);

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
		MALE, FEMALE , PREFER_NOT_TO_SAY
	}
}
