package com.coforge.Beans;

public class Customer {
	private int cid;
	private String cname;
	private Address address;
	private String mobile;
	private String email;
	public Customer(int cid, String cname, Address address, String mobile, String email) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	public Customer() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + ", mobile=" + mobile + ", email="
				+ email + "]";
	}
	

}
