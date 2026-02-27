package com.coforge;

public class UPI extends Payment{
	String upiId;
	String bankName;
	public UPI(String upiId, String bankName, int amt) {
		super(amt);
		this.upiId=upiId;
		this.bankName = bankName;
	}
	
	public void pay(int amt) {
		System.out.println("Payment of Rs" + amt + " completed");
	}
	
	public void paymentReceipt() {
		System.out.println("Payment Receipt");
	    System.out.println("UPI ID: " + upiId);
	    System.out.println("Bank Name: " + bankName);
	    System.out.println("Amount Paid: Rs" + amt);
	}
}
