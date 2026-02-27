package com.coforge;

public class Wallet extends Payment{
	long number;
	String bankName;
	public Wallet(long number, String bankName, int amt) {
		super(amt);
		this.number = number;
		this.bankName = bankName;
	}
	public void pay(int amt) {
		System.out.println("Payment of Rs" + amt + " completed");
	}
	
	public void paymentReceipt() {
		System.out.println("Payment Receipt");
	    System.out.println("Phone Number: " + number);
	    System.out.println("Bank Name: " + bankName);
	    System.out.println("Amount Paid: Rs" + amt);
	}
}
