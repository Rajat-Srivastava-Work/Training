package com.coforge.Day4MavenPrj;

public class Main {
	public static void main(String[] args) {
		CreditCard obj = new CreditCard();
		obj.pay(2000);
		
		System.out.println("Max Limit: " + Payment.maxLimit);
	}
}
