package com.coforge;


import java.util.Scanner;

import com.coforge.dao.ItemDao;

import com.coforge.dao.OrderDao;
import com.coforge.entities.Item;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	//ItemDao dao=new ItemDao();
    	//dao.getAllItems().forEach(item->System.out.println(item));
    	//dao.insertItem(new Item(9,"Graphics Card",7000));
    	//dao.getAllItems().forEach(item->System.out.println(item));
    	//System.out.println(dao.getById(2));
    	
    	int choice=0;
    	Scanner sc=new Scanner(System.in);
    	ItemDao dao=new ItemDao();
    	
    	do {
    		
    		System.out.println("1- Display all items");
    		System.out.println("2- Insert an item");
    		System.out.println("3- Update an item");
    		System.out.println("4- Delete an item");
    		System.out.println("5- Display item by Id");
    		System.out.println("6- Exit");
    		
    		System.out.println("Enter your choice:");
    		choice=sc.nextInt();
    		
    		switch(choice) {
    		case 1:
    			dao.getAllItems().forEach(it->System.out.println(it));
    			break;
    			
    		case 2:
    			System.out.println("Enter item id:");
    			long id=sc.nextLong();
    			System.out.println("Enter item name:");
    			String name=sc.next();
    			System.out.println("Enter item cost:");
    			double cost=sc.nextDouble();
    			dao.insertItem(new Item(id,name,cost));
    			System.out.println("Item inserted");
    			break;
    		case 3:
    			System.out.println("Enter item id:");
    			long id1=sc.nextLong();
    			System.out.println("Enter item name:");
    			String name1=sc.next();
    			System.out.println("Enter item cost:");
    			double cost1=sc.nextDouble();
    			dao.updateItem(new Item(id1,name1,cost1));
    			System.out.println("item updated");
    			break;
    		case 4:
    			System.out.println("Enter item id to delete:");
    			long id2=sc.nextLong();
    			dao.deleteItem(id2);
    			System.out.println("item deleted");
    			break;
    		case 5:
    			System.out.println("Enter item to display:");
    			long id3=sc.nextLong();
    			dao.getById(id3);
    			break;
    		case 6:
    			System.out.println("Application exited");
    			break;
    		default:
    			System.out.println("Invalid choice");
    		}
    		
    	} while(choice!=6);
    	
    	OrderDao ordDao=new OrderDao();
    	ordDao.getAllOrders().forEach(ord->System.out.println(ord));
    	sc.close();
    	
    	
    	//create menu driven program
    }    
}
