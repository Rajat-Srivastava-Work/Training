package com.coforge.SpringPrjWithAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.Beans.Book;
import com.coforge.Beans.Order;
import com.coforge.configuration.BookOrderConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //ApplicationContext context=new ClassPathXmlApplicationContext("book-bean.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(BookOrderConfig.class);

        Book b=(Book) context.getBean("book");
        System.out.println(b);
        
        Order o=(Order) context.getBean("order");
        System.out.println(o);
    }
}
