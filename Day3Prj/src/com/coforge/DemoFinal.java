package com.coforge;

public class DemoFinal {
	protected final String name="Rajat";
	
	public void printDetails() {
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		DemoFinal df = new DemoFinal();
		df.printDetails();
	}
}