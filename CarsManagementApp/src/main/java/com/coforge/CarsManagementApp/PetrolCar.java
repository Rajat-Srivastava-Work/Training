package com.coforge.CarsManagementApp;

public class PetrolCar extends Car implements AddOns{
	
	@Override
	public void engineType() {
		System.out.println("Engine type is Petrol type");
	}
	
	@Override
	public void audioSystem() {
		System.out.println("Audio system is with 6 speakers, woofers added");
	}
	public PetrolCar(String model) {
		super(model);
	}
	
	public void showWarrantyPolicy() {
		AddOns.warrantyPolicy();
	}

}
