package br.com.willbigas.functionalinterface;

import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {

		System.out.println("Increment Method");
		int increment = incrementByOne(1);
		System.out.println(increment);


		System.out.println("Increment Function");
		Integer increment2 = incrementByOneFunction.apply(1);
		System.out.println(increment2);


		System.out.println("Multiply Function");
		int multiply = multiplyBy10Function.apply(10);
		System.out.println(multiply);

		Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);

		System.out.println("Combined Functions (Increment and Multiply in the same process)");
		Integer apply = addBy1AndThenMultiplyBy10.apply(10);
		System.out.println(apply);

	}


	static Function<Integer, Integer> incrementByOneFunction =
			number -> number + 1;

	static Function<Integer, Integer> multiplyBy10Function =
			number -> number * 10;

	static int incrementByOne(int number) {
		return number + 1;
	}
}
