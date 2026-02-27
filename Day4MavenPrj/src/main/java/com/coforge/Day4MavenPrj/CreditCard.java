package com.coforge.Day4MavenPrj;

public class CreditCard implements Payment{
	public void pay(int amount) {
		System.out.println("Payment done using Credit Card: " + amount);
	}
}
