package com.coforge.CarsManagementApp;

public class DieselCar extends Car implements AddOns{
	
	@Override
	public void engineType() {
		System.out.println("Engine type is Diesel type");
	}
	
	@Override
	public void audioSystem() {
		System.out.println("Audio system is with 8 speakers, woofers added");
	}
	public DieselCar(String model) {
		super(model);
	}
	
	public void showWarrantyPolicy() {
		AddOns.warrantyPolicy();
	}

}
