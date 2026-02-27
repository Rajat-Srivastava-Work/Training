package com.coforge.Day4MavenPrj;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
    	MyInterface mi = new DemoClass();
    	mi.display();
    	mi.printDetails();
    	mi=new HelloClass();
    	mi.display();
    	mi.printDetails();
    	
    	MyInterface.useParking("Coforge");
    }
}
