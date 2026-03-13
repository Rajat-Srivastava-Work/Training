package com.coforge.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.Beans.Book;
import com.coforge.Beans.Order;

@Configuration
public class BookOrderConfig {
	@Bean(name="order")
	public Order getOrderBean() {
		return new Order(3456,5,6000,getBookBean());
	}
	@Bean(name="book")
	public Book getBookBean() {
		String authArr[]= {"Rajat","Amit","Aman"};
		List<String>authorList=Arrays.asList(authArr);
		Book b=new Book(121,"Java Tutorials",1000,authorList);
		return b;
	}
}
 