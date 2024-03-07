package br.com.willbigas.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		System.out.println("Normal Method");
		Customer maria = new Customer("Maria", "99999");
		greetCustomer(maria);

		System.out.println("Consumer Functional Interface!!");
		greetCustomerConsumer.accept(maria);


		System.out.println("BiConsumer Functional Interface!!");
		greetCustomerBiConsumer.accept("Maria", "99999");


		System.out.println("BiConsumer Functional Interface 2!!");
		greetCustomerConsumerV2.accept(maria, Boolean.TRUE);
		greetCustomerConsumerV2.accept(maria, Boolean.FALSE);
	}

	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.customerName
				+ " thanks for registering phone number "
				+ customer.customerPhoneNumber);
	}


	/**
	 * Consumer normal com 1 Parâmetro e nenhum retorno
	 */
	static Consumer<Customer> greetCustomerConsumer = customer ->
			System.out.println("Hello " + customer.customerName
					+ " thanks for registering phone number "
					+ customer.customerPhoneNumber);


	/**
	 * Bi Consumer com 2 parâmetros e nenhum retorno
	 */

	static BiConsumer<String, String> greetCustomerBiConsumer = (name, phone) ->
			System.out.println("Hello " + name
					+ " thanks for registering phone number "
					+ phone);


	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhone) ->
			System.out.println("Hello " + customer.customerName
					+ " thanks for registering phone number "
					+ (showPhone ? customer.customerPhoneNumber : "**********"));


	/**
	 * Método (Procedimento) normal com 2 parâmetros e nenhum retorno
	 *
	 * @param customer
	 * @param showPhone
	 */
	static void greetCustomerV2(Customer customer, Boolean showPhone) {
		System.out.println("Hello " + customer.customerName
				+ " thanks for registering phone number "
				+ (showPhone ? customer.customerPhoneNumber : "**********"));
	}


	static class Customer {
		private final String customerName;
		private final String customerPhoneNumber;

		public Customer(String customerName, String customerPhoneNumber) {
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
	}
}
