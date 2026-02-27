package com.coforge.PaymentMenu;

public class NetBanking extends Payment{
	void pay(double amount) {
		System.out.println("Processing Net Banking...");
		generateReceipt(amount);
	}
}
