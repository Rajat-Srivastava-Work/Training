package com.coforge.Day6MavenPrj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Account {
	public long accId;
	private String accHolderName;
	private String bankName;
	private double balance;
	
	public void withDraw(double amount) {
		if(amount<=this.balance) {
			this.balance-=amount;
			System.out.println("Withdraw Successful");
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("Amount deposited = " + this.balance);
	}

}
