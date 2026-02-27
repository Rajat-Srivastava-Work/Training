package com.coforge.Day4MavenPrj;
@FunctionalInterface
public interface MyInterface {
	public void display();
	
	public default void printDetails() {
		System.out.println("Default method of interface invoked");
	}
	
	public static void useParking(String companyName) {
		System.out.println("This is " + companyName + " parking");
	}
}
