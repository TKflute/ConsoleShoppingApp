package com.cognixia.jumplus.view;

import java.util.ArrayList;
import java.util.List;

import com.cognixia.jumplus.model.Item;

public class ConsolePrinter {

	// TODO: I may change this class from my approach for last project
	// Could use this class like a place to call render() for things that are more complicated to display
	// this would be for menus that aren't interactive w/ each line
	// could assemble these menus in a service layer, just to separate concerns a bit more
	// still use this class to print interactive menus, like creating account
	
	List<Item> items = new ArrayList<Item>(); // this will be moved to Store
	
	public void populateItems() {
		
		items.add(new Item("Shirt", "S1", 25.00));
		items.add(new Item("pants", "p1", 10.00));
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
	
	public void printAfterLogin() {
		
		populateItems(); // will probably want to move data outside of this class (if no DB)
		printHeader();
		System.out.println("|\tItems\tItem Code\tPrice\t|");
		int itemCount = 1;
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
