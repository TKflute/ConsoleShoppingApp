package com.cognixia.jumplus.view;

import java.util.List;

import com.cognixia.jumplus.controller.ShoppingAppController;
import com.cognixia.jumplus.model.Customer;
import com.cognixia.jumplus.model.Item;
import com.cognixia.jumplus.model.Store;

public class ConsolePrinter {

	// TODO: I may change this class from my approach for last project
	// Could use this class like a place to call render() for things that are more complicated to display
	// this would be for menus that aren't interactive w/ each line
	// could assemble these menus in a service layer, just to separate concerns a bit more
	// still use this class to print interactive menus, like creating account
	private Store store;
	private ShoppingAppController controller;
	
	public ConsolePrinter() {
		store = new Store();
		controller = new ShoppingAppController();
	}
	
	public void printMainMenu() {
		
		printHeader();
		System.out.println("|   1.REGISTER			|");
		System.out.println("|   2.LOGIN			|");
		System.out.println("|   3.BUY AN ITEM		|");
		System.out.println("|   4.REPLACE AN ITEM	        |");
		System.out.println("|   5.EXIT			|");
		System.out.println("+=====================================+");
	}
	
	public void printAccountCreation() {
		System.err.println("+---------------------------\n| Enter Details For New Account |\n+---------------------------\n");
		System.err.println("Customer Name:\n");
		String name = controller.takeInput();
		
		System.err.println("Customer Address:\n");
		String address = controller.takeInput();
		
		System.err.println("Customer Phone Number:\n");
		String phoneNumber = controller.takeInput();
		
		System.err.println("Enter a valid email address:\n");
		String email = controller.takeInput();
		// validate email w/ CAS
		
		System.err.println("Choose a password (8-20 characters including upper, lower, and special):\n");
		String password = controller.takeInput();
		
		
//		Account newAccount = dataService.createAccount(accountType, initialDeposit);
//		dataService.addCustomer(new Customer(name, address, phoneNumber, userId, password, newAccount));
//		displayCustomerLogin();
		// TODO: write to file?
	}
	
	public void printAfterLogin() {
		
		printHeader();
		System.out.println("|  Items\tItem Code\tPrice\t|\n");
		
		int itemCount = 1;
		List<Item> items = store.getItems();
		for(Item item : items) {
			System.out.println(itemCount++ + ". " + item.getName() + "\t" + item.getCode() + "\t\t" + item.getPrice());
		}
	}
	
	public void printInvoice() {
		printHeader();
		// TODO: Do I want to do all sysouts in this class?
		// or should I prepare String data to be printed in a Service class, and then print out template here
		// sort of like making a component elsewhere and calling render() here
	}
	
	public void printHeader() {
		
		System.out.println("Standalone Ecommerce App");
		System.out.println("+=====================================+");
	}
}
