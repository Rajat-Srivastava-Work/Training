package com.coforge;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Rajat" , 456, 75000);
		Employee e2 = new Employee("Mayank" , 123, 65000);
		Employee e3 = new Employee("Gaurav", 789, 70000);
		Employee.companyName = "Coforge Technology";
		
		e1.calcSalary();
		e2.calcSalary();
		e3.calcSalary();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}
