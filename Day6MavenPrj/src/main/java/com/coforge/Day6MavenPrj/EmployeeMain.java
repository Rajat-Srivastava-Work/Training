package com.coforge.Day6MavenPrj;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeMain {
	
	static HashSet<Employee> empSet = new HashSet<Employee>();
	
	static {
		empSet.add(new Employee(123, "Rajat", 80000));
		empSet.add(new Employee(124, "Mayank", 80000));
		empSet.add(new Employee(125, "Gaurav", 80000));
		empSet.add(new Employee(126, "Deepansh", 80000));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		empSet.forEach(e -> System.out.println(e));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details,empId, empName, salary");
		Employee emp = new Employee(sc.nextLong(),sc.next(),sc.nextDouble());
		empSet.add(emp);
		System.out.println("Enter employee id for updation");
		//long id = sc.nextLong();
		sc.close();
		
	}

}
