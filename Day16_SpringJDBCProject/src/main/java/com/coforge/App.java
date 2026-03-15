package com.coforge;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.configuration.AppConfig;
import com.coforge.dao.EmployeeDAO;
import com.coforge.entities.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeDAO dao=context.getBean(EmployeeDAO.class);
        
        //Employee e=new Employee(124,"Mayank", 90000);
        //dao.insertEmployee(e);
        //dao.getAllEmployee().forEach(e1->System.out.println(e1));
        //System.out.println(dao.getEmployeeById(123));
        //Employee e2=new Employee(123,"Rajat",100000);
        //dao.updateEmployee(123, e2);
        //dao.deleteEmployee(124);
        //context.close();
        
        Scanner sc = new Scanner(System.in);
        
        int choice = 0;
        do {
        	try {
	        	System.out.println("------------------------------------------------------------");
	        	System.out.println("Please choose an option");
	        	System.out.println("1: Enter a new Emloyee");
	        	System.out.println("2: Get all Employees");
	        	System.out.println("3: Update an Employee");
	        	System.out.println("4: Delete an Employee");
	        	System.out.println("5: Exit");
	        	
	        	choice = sc.nextInt();
	        	
	        	switch(choice) {
	        	case 1:
	        		System.out.println("Please Enter empId, ename and salary");
	        		dao.insertEmployee(new Employee(sc.nextLong(),sc.next(),sc.nextDouble()));
	        		break;
	        	case 2:
	        		dao.getAllEmployee().forEach(e->System.out.println(e));
	        		break;
	        	case 3:
	        		System.out.println("Please Enter empId and new ename and new salary");
	        		Employee emp = new Employee(sc.nextLong(),sc.next(),sc.nextDouble());
	        		dao.updateEmployee(emp.getEmpId(), emp);
	        		break;
	        	case 4:
	        		System.out.println("Please Enter empId");
	        		dao.deleteEmployee(sc.nextLong());
	        		break;
	        	case 5:
	        		System.out.println("Thank you for using our application");
	        		break;
	        	default:
	        		System.out.println("Invalid Operation");
	        	}
        	} catch (Exception e) {
        		e.printStackTrace();
        	}
        }while(choice != 5);
        context.close();
    }
    
 
}
