package br.com.willbigas.combinatorpattern;

import java.time.LocalDate;

import static br.com.willbigas.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(
				"Alice",
				"alicegmail.com",
				"+0898787879878",
				LocalDate.of(2000, 1 , 1)
		);


//		System.out.println(new CustomerValidatorService().isValid(customer));

		// if valid we Can store customer in db

		// Using combinator Pattern

		ValidationResult result = isEmailValid()
				.and(isAdult())
				.and(isPhoneNumberValid())
				.apply(customer);

		if (result != ValidationResult.SUCCEESS) {
			throw new IllegalStateException(result.name());
		}

		System.out.println(result);
	}
}
