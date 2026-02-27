package com.coforge.PaymentMenu;

abstract class Payment {
	static int transactionCount = 0;
	abstract void pay(double amount);
	
	final void generateReceipt(double amount) {
		transactionCount++;
		System.out.println("Payment Successfull of Rs." + amount);
		System.out.println("Transaction ID: TXN" + transactionCount);
	}
}
