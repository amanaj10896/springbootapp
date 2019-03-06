package com.tricon.pov.CustomersOrders.PojoClasses;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private String id;
	private String name;
	private String phoneNo;
	private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getphoneNo() {
		return phoneNo;
	}
	public void setphoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer(String id, String name, String phoneNo, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}
	
	
	

}

