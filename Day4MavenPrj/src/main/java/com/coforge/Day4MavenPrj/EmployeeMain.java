package com.coforge.Day4MavenPrj;

import java.util.function.Consumer;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 =new Employee("Rajat",101,65000);
		Employee e2 = new Employee("Mayank",102,65000);
		Employee e3 = new Employee("Gaurav",103,65000);
		Employee e4 = new Employee("Deepansh",104,70000);
		
		Employee empArr[] = {e1,e2,e3,e4};
		for(Employee emp: empArr) {
			System.out.println(emp);
		}
		
		Consumer<Employee[]> empConsumer = (empArr1)->{
			double max = empArr1[0].getSalary();
			for(Employee emp: empArr) {
				System.out.println(emp.getEname());
				if(emp.getSalary() > max) {
					max = emp.getSalary();
				}
				
			}
			System.out.println(max);
		};
		empConsumer.accept(empArr);

	}

}
