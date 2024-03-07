package br.com.willbigas.functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {

		System.out.println("Simple method");
		System.out.println(isPhoneNumberValid("07848778971"));


		System.out.println("Using Predicate");
		System.out.println(isPhoneNumberValidUsingPredicate.test("07848778971"));

		System.out.println("Using Combined Predicate");
		System.out.println(isPhoneNumberValidUsingPredicate.and(containsNumber3).test("07848738971"));


		System.out.println("Using BiPredicate");
		System.out.println(isPhoneNumberValidByStartsWithUsingBiPredicate.test("07848778971" , "07"));
	}

	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	}

	static Predicate<String> isPhoneNumberValidUsingPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

	static BiPredicate<String , String> isPhoneNumberValidByStartsWithUsingBiPredicate = (phoneNumber , startsWith) -> phoneNumber.startsWith(startsWith) && phoneNumber.length() == 11;

	static Predicate<String> containsNumber3 = number -> number.contains("3");

}
