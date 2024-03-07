package br.com.willbigas.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {

		// Functional with 1 argument and produce 1 result
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


		//BiFunction with 2 arguments and produce 1 result

		System.out.println("Increment and Multiply - Method normal");
		int incrementAndMultiply = incrementByOneAndMultiply(4, 100);
		System.out.println(incrementAndMultiply);


		System.out.println("Increment and Multiply - BiFunction");
		int incrementAndMultiplyFunction = incrementByOneAndMultiplyFunction.apply(4, 100);
		System.out.println(incrementAndMultiplyFunction);


	}


	static Function<Integer, Integer> incrementByOneFunction =
			number -> number + 1;

	static Function<Integer, Integer> multiplyBy10Function =
			number -> number * 10;

	static int incrementByOne(int number) {
		return number + 1;
	}


	/**
	 * Funcao com 2 parâmetros que retona um valor
	 */
	static BiFunction<Integer,  Integer , Integer> incrementByOneAndMultiplyFunction =
			(numberToIncrementByOne , numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

	/**
	 * Metodo convencional do Bifunction
	 * @param number
	 * @param numToMultiplyBy
	 * @return
	 */
	static int incrementByOneAndMultiply(int number , int numToMultiplyBy) {
		return (number + 1) * numToMultiplyBy;
	}
}
