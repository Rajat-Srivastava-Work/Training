package com.coforge.Day5MavenPrj;

public class Customer {
	private int custId;
	private String custName;
	private String city;
	private int orderCost;
	
	public Customer() {
		super();
	}
	
	public Customer(int custId, String custName, String city, int i) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.city = city;
		this.orderCost = i;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", city=" + city + ", orderCost=" + orderCost
				+ "]";
	}
	
	public int compareTo(Customer o) {
		return (int)(this.getOrderCost()-o.getOrderCost());
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(int orderCost) {
		this.orderCost = orderCost;
	}
	
	
	
	
	
	
	
	

}
