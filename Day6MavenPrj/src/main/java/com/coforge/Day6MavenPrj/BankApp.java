package com.coforge.Day6MavenPrj;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(123456,"Rajat", "Canara Bank", 5000);
		acc.withDraw(1000);
		acc.deposit(10000);

	}

}
