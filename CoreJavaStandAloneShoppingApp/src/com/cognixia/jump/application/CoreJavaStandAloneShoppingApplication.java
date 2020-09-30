package com.cognixia.jump.application;

import java.util.Scanner;

import com.cognixia.jump.service.CreateAccountService;
import com.cognixia.jumplus.view.ConsolePrinter;

public class CoreJavaStandAloneShoppingApplication {
	
	public static void main(String[] args) {
		
//		ConsolePrinter cPrint = new ConsolePrinter();
//		cPrint.printMainMenu();
//		cPrint.printAfterLogin();
		
		CreateAccountService createAccountService = new CreateAccountService();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an email address");
		String email = input.nextLine().trim();
		if(createAccountService.validateEmail(email)) {
			System.out.println("Valid email");
		}else {
			System.out.println("Invalid email");
		}
		
		System.out.println("Enter a password");
		String password = input.nextLine().trim();
		if(createAccountService.validatePassword(password)) {
			System.out.println("Valid password");
		}else {
			System.out.println("Invalid password");
		}
	}
}
