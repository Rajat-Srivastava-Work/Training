package com.coforge.SpringFrameworkPrj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.Beans.Employee;
//import com.coforge.Beans.HelloBean;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ApplicationContext context=new ClassPathXmlApplicationContext("emp-bean.xml");
        //HelloBean hbean=(HelloBean) context.getBean("hello");
        
        //hbean.sayHello();
        //hbean.printName("Rajat");
        
        Employee emp=(Employee) context.getBean("emp");
        System.out.println(emp);
        
    }
}
