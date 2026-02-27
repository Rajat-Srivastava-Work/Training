package com.coforge.shapes;

public class Triangle implements Shape {
	
	private double base;
	private double height;
	private double hypotenuse;
	
	public Triangle() {
		super();
	}
	
	public Triangle(double base, double height,double hypotenuse) {
		super();
		this.base=base;
		this.height=height;
		this.hypotenuse=hypotenuse;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(0.5*base*height);

	}

	@Override
	public void circum() {
		// TODO Auto-generated method stub
		System.out.println(base+height+hypotenuse);
		

	}

}
