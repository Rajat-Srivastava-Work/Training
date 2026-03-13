package com.coforge.Beans;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;

public class Order {
	//@Value("1111")
	private int ordId;
	//@Value("10")
	private int units;
	//@Value("6000")
	private double orderCost;
	@Autowired
	private Book book;
	public Order(int ordId, int units, double orderCost, Book book) {
		super();
		this.ordId = ordId;
		this.units = units;
		this.orderCost = orderCost;
		this.book = book;
	}
	public Order() {
		super();
	}
	public int getOrdId() {
		return ordId;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", units=" + units + ", orderCost=" + orderCost + ", book=" + book + "]";
	}
	
	
	
	
}
