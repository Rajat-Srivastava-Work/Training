package com.coforge.Day5MavenPrj;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer(1, "Rajat", "Hyd", 56000);
		Customer c2 = new Customer(2, "Mayank", "Hyd", 60000);
		Customer c3 = new Customer(3, "Gaurav", "Hyd", 65000);
		Customer c4 = new Customer(4, "Vishesh", "Blr", 70000);
		Customer c5 = new Customer(5, "Arun", "Blr", 75000);
		
		ArrayList<Customer> custList = new ArrayList<Customer>();
		custList.add(c1);
		custList.add(c2);
		custList.add(c3);
		custList.add(c4);
		custList.add(c5);
		
		
		custList.sort(new CityComparator().thenComparing(new OrderCostComparator()));
		custList.forEach(cust->System.out.println(cust));
		
		
		

	}

}
