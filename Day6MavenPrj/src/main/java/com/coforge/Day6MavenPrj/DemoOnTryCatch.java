package com.coforge.Day6MavenPrj;

import java.io.FileReader;
import java.io.IOException;

public class DemoOnTryCatch {
	
	public static void readFile() throws IOException {
		FileReader reader = new FileReader("data.txt");
		reader.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		
		//-------------------------------UNCHECKED EXCEPTION---------------------------------------------
		try {
			int a=5,b=0;
			System.out.println(a/b);
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occured");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch(RuntimeException e) {
			System.out.println("Runtime Exception occured ");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Execution ended");
		}
		
		String s= "Rajat";
		 try {
			 System.out.println(s.charAt(2));
		 } catch(NullPointerException e) {
			 System.out.println("Null Pointer exception");
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		 } finally {
			 System.out.println("Application completed");
		 }
		 
		 //-----------------------------------CHECKED EXCEPTION---------------------------------------------
		FileReader reader = null;
		try {
			reader = new FileReader("data.txt");
			int ch;
			while((ch=reader.read()) != -1) {
				System.out.println((char) ch);
		    } 
			
		} catch( IOException e) {
			System.out.println("Exception occured");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(reader!=null) {
					reader.close();
				}
			} catch (IOException e) {
				System.out.println("Reader Exception Occured");
			} 
		}
		
	    readFile();
	}

}
