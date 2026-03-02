package com.coforge.Assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MenuDrivenCRUD {
	
	static HashSet<Bank> bankSet = new HashSet<Bank>();
	

	static {
		bankSet.add(new Bank(123, "Rajat", 80000));
		bankSet.add(new Bank(124, "Mayank", 80000));
		bankSet.add(new Bank(125, "Gaurav", 80000));
		bankSet.add(new Bank(126, "Deepansh", 80000));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int choice;
		do {
			
			System.out.println("1- Create Account");
			System.out.println("2- Read Account Details");
			System.out.println("3-Update Account Details");
			System.out.println("4- Delete Account Details");
			System.out.println("5- Exit");
			System.out.println("Enter your choice: ");
		    choice = sc.nextInt();
		    
		    switch (choice) {
		    case 1: 
		    	createAccount(sc);
		    	break;
		    case 2:
		    	readAccount(sc);
		    	break;
		    case 3:
		    	updateAccount(sc);
		    	break;
		    case 4:
		    	deleteAccount(sc);
		    	break;
		    case 5:
		    	System.out.println("Exiting application.");
		    	break;
		    default:
		    	System.out.println("Invalid choice");
		    }
		} while(choice!=5);
		sc.close();
		
	}
	public static void createAccount(Scanner sc) {
		
		System.out.println("Enter account no.:");
		int accno = sc.nextInt();
		System.out.println("Enter account holder name:");
		String name = sc.next();
		System.out.println("Enter bank balance:");
		Double balance = sc.nextDouble();
		Bank b = new Bank(accno,name,balance);
		if(bankSet.add(b)) {
			System.out.println("Account added");
		} else {
			System.out.println("account already exists");
		}
		
	}
	public static void readAccount(Scanner sc) {
		if(bankSet.isEmpty()) {
			System.out.println("NO ACCOUNT DETAILS FOUND");
		} else {
			System.out.println("Account Details");
			bankSet.forEach(e -> System.out.println(e));
		}
	}
	public static void updateAccount(Scanner sc) {
		
		System.out.println("Enter account number to uodate");
		int num = sc.nextInt();
		boolean exist = false;
		for(Bank bank: bankSet) {
			if(bank.getAccno() == num) {
				System.out.println("Enter new name:");
				bank.setName(sc.next());
				System.out.println("Enter new balance:");
				bank.setBalance(sc.nextDouble());
				System.out.println("Account details updated");
				exist = true;
				break;
			}
		}
		if(!exist) {
			System.out.println("Account not found");
		}
		
		
	}
	public static void deleteAccount(Scanner sc) {
		
		System.out.println("Enter account number to delete:");
		int num = sc.nextInt();
		Iterator<Bank> itr = bankSet.iterator();
		boolean exist = false;
		while(itr.hasNext()) {
			Bank bank = itr.next();
			if(bank.getAccno()==num) {
				itr.remove();
				System.out.println("Account deleted successfully");
				exist = true;
				break;
			}
		}
		if(!exist) {
			System.out.println("Account not found");
		}
		
	}

}
