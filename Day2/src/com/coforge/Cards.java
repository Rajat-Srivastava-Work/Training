package com.coforge;

public class Cards extends Payment {
	
	long cardNo;
	int cvv;
	String expDate;
	
	public Cards(long cardNo, int cvv, String expDate, int amt) {
		super(amt);
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.expDate = expDate;
	}
	public void pay() {
		System.out.println("Payment Successfull");
	}
}
