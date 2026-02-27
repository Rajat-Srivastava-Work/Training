package com.coforge;

public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cards ob1 = new Cards(1234567, 123, "4/4/27", 4567);
		ob1.pay();
		UPI ob2 = new UPI("phonepe@6789","icici",7484);
		ob2.pay(7484);
		Wallet ob3 = new Wallet(12345678,"icici",5678);
		ob3.pay(5678);
		ob3.paymentReceipt();
	}

}
