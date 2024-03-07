package br.com.willbigas.optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
//		Object o = Optional.ofNullable(null)
//				.orElseGet(() -> "default value");
//
//		Supplier<IllegalArgumentException> exceptionSupplier = () -> new IllegalArgumentException("exception");
//
//		Object o2 = Optional.ofNullable(null)
//				.orElseThrow(exceptionSupplier);

		Optional.ofNullable(null)
				.ifPresentOrElse(email -> System.out.println("Sending email to " + email),
						() -> System.out.println("Cannot send Email"));


//		System.out.println(o);
//		System.out.println(o2);
	}
}
