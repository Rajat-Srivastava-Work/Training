package com.coforge.Day15_CustomerSpringPrj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.Beans.Customer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context=new ClassPathXmlApplicationContext("customer-bean.xml");
        
        Customer cust1=(Customer) context.getBean("customer1");
        System.out.println(cust1);
        
        Customer cust2=(Customer) context.getBean("customer2");
        System.out.println(cust2);
        
        Customer cust3=(Customer) context.getBean("customer3");
        System.out.println(cust3);
        
        Customer cust4=(Customer) context.getBean("customer4");
        System.out.println(cust4);
    }
}
