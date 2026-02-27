package com.coforge.shapes;

import java.util.Scanner;

import com.coforge.Circle;
import com.coforge.Shape;
import com.coforge.Square;

public class ShapesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape sh;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your choice:");
		System.out.println("1.Square");
		System.out.println("2.Circle");
		System.out.println("3.Triangle");
		System.out.println("4.Exit");
		
		
		do {
			int choice;
			choice = sc.nextInt();
			if(choice==1) {
				System.out.println("Enter side");
				double s = sc.nextDouble();
				sh = new Square(s);
				sh.area();
				sh.circum();
			} else if(choice==2) {
				System.out.println("Enter radius:");
				double r = sc.nextDouble();
				sh=new Circle(r);
				sh.area();
				sh.circum();
			} else if(choice ==3) {
				System.out.println("Enter base:");
				double b = sc.nextDouble();
				System.out.println("Enter height:");
				double h = sc.nextDouble();
				System.out.println("Enter hypotenuse:");
				double hyp = sc.nextDouble();
				sh=(Shape) new Triangle(b,h,hyp);
				sh.area();
				sh.circum();
			}
			else if(choice==4){
				break;
			}
		} while(true);
		sc.close();
		
		
	}

}
