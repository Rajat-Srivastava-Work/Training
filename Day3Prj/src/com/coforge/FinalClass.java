package com.coforge;

public class FinalClass extends DemoFinal {
	public void printDetails() {
		System.out.println(name.toUpperCase());
	}
	
	public static void main(String[] args) {
		DemoFinal df= new DemoFinal();
		df.printDetails();
		
		final double pi = 3.14;
	}

}
