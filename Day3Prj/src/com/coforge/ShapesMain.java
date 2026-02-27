package com.coforge;

import java.util.Scanner;

public class ShapesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh;
		String type;
		System.out.println("Enter type of shape:");
		Scanner sc = new Scanner(System.in);
		type=sc.next();
		
		if(type.equals("Circle")) {
			System.out.println("Enter radius:");
			double r = sc.nextDouble();
			sh=new Circle(r);
			sh.area();
			sh.circum();
		} else if(type.equals("Square")) {
			System.out.println("Enter side");
			double s = sc.nextDouble();
			sh = new Square(s);
			sh.area();
			sh.circum();
			
		}
		sc.close();
		
		Circle c=new Circle(7);
		c.area();
		c.circum();
		
		Square s = new Square(5);
		s.area();
		s.circum();
		
		sh = new Circle(6);
		sh.area();
		sh.circum();
		
		sh = new Square(7);
		sh.area();
		sh.circum();

	}

}
