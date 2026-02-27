package com.coforge;

/**
 * 
 */
public class Employee {
	
	private String name;
	private int id;
	static String companyName = "Coforge";
	private double basicSalary;

	public Employee() {
		super();
	}
	
	public Employee(String name, int id, double basicSalary) {
		super();
		this.name=name;
		this.id=id;
		this.basicSalary = basicSalary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "Company: "+ companyName + "]";
	}
	
	public void calcSalary() {
		double netSalary;
		if(this.basicSalary > 5000) {
			double hra = 0.10;
			double da = 0.10;
			netSalary = basicSalary + basicSalary*hra + basicSalary*da;
		}
		else {
			netSalary = basicSalary;
		}
		System.out.println("Net Salary = " + netSalary);
	}
	
	
}
