package com.coforge;

public class DemoStatic {
	
	static {
		System.out.println("My first static block.");
	}
	
	static {
		System.out.println("Second static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Main");
	}
	
	static {
		System.out.println("Third static block");
	}
	
	static {
		System.out.println("Fourth static block");
	}

}
