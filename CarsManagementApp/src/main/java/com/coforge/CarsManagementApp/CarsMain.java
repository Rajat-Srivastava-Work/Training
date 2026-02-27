package com.coforge.CarsManagementApp;

public class CarsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetrolCar pcar = new PetrolCar("Swift");
		pcar.engineType();
		pcar.audioSystem();
		pcar.showModel();
		pcar.roofOpen();
		pcar.showWarrantyPolicy();
		
		DieselCar dcar = new DieselCar("Scorpio");
		dcar.engineType();
		dcar.audioSystem();
		dcar.showModel();
		dcar.roofOpen();
		dcar.showWarrantyPolicy();

	}

}
