package com.coforge.Day4MavenPrj;

public class DemoClass implements MyInterface{
	@Override
	public void display() {
		System.out.println("From demo class display method");
	}
	
	@Override
	public void printDetails() {
		System.out.println("Print details from demo class");
	}
	
}
