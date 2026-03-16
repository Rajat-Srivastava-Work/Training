package com.coforge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.dao.CustomerDao;
import com.coforge.dao.EmployeeDao;
import com.coforge.entities.Address;
import com.coforge.entities.Customer;
import com.coforge.entities.Employee;
import com.coforge.entities.Order;
import com.coforge.utils.HibernateUtil;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        EmployeeDao dao=new EmployeeDao();
        /*Address address= new Address("Hyderabad","Telangana","500032");
        Employee emp=new Employee("Gaurav","gaurav@example.com","9818282393",address);
        
        dao.insertEmployee(emp);
        dao.getAllEmployee().forEach(e->System.out.println(e));*/
//        SessionFactory sf=HibernateUtil.getSessionFactory();
//        Session session=sf.openSession();
        
        System.out.println("Tables created");
        
        int choice=0;
    	Scanner sc=new Scanner(System.in);
    	CustomerDao custDao=new CustomerDao();
    	
    	do {
    		
    		System.out.println("1- Display all customers");
    		System.out.println("2- Insert a customer");
    		System.out.println("3- Update a customer");
    		System.out.println("4- Delete a customer");
    		System.out.println("5- Display customer by Id");
    		System.out.println("6- Exit");
    		
    		System.out.println("Enter your choice:");
    		choice=sc.nextInt();
    		
    		switch(choice) {
    		case 1:
    			custDao.getAllCustomers().forEach(c->System.out.println(c));
    			break;
    			
    		case 2:
    			
    			System.out.println("Enter customer name:");
    			String name=sc.next();
    			System.out.println("Enter customer city:");
    			String city=sc.next();
    			ArrayList<Order> ordList=new ArrayList<>();
    			System.out.println("Enter product name:");
    			String pname=sc.next();
    			System.out.println("Enter order amount");
    			Double pamount=sc.nextDouble();
    			ordList.add(new Order(pname,pamount));
    			custDao.insertCustomer(new Customer(name,city,ordList));
    			System.out.println("Item inserted");
    			break;
    		case 3:
    			System.out.println("Enter customer name:");
    			String name1=sc.next();
    			System.out.println("Enter customer city:");
    			String city1=sc.next();
    			ArrayList<Order> ordList1=new ArrayList<>();
    			System.out.println("Enter product name:");
    			String pname1=sc.next();
    			System.out.println("Enter order amount");
    			Double pamount1=sc.nextDouble();
    			ordList1.add(new Order(pname1,pamount1));
    			custDao.updateCustomer(new Customer(name1,city1,ordList1));
    			System.out.println("item updated");
    			break;
    		case 4:
    			System.out.println("Enter customer id to delete:");
    			long id2=sc.nextLong();
    		    custDao.deleteCustomer(id2);
    			System.out.println("item deleted");
    			break;
    		case 5:
    			System.out.println("Enter customer to display:");
    			long id3=sc.nextLong();
    			custDao.getCustomerById(id3);
    			break;
    		case 6:
    			System.out.println("Application exited");
    			break;
    		default:
    			System.out.println("Invalid choice");
    		}
    		
    	} while(choice!=6);
    	
    	sc.close();
        
        
    }
}
