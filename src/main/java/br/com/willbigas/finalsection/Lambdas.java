package br.com.willbigas.finalsection;

import java.util.function.BiFunction;

public class Lambdas {

	public static void main(String[] args) {

		BiFunction<String, Integer, String> uppercaseName = (name ,age) -> {
			//Logic
			if (name.isBlank()) throw new IllegalArgumentException("");
			System.out.println(age);
			return name.toUpperCase();
		};

		String alex = uppercaseName.apply("Alex", 20);
		System.out.println(alex);

	}


}
