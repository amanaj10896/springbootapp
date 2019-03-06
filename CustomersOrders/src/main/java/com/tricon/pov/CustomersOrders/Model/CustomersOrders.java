package com.tricon.pov.CustomersOrders.Model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tricon.pov.CustomersOrders.PojoClasses.Customer;




@Component
public class CustomersOrders {
	
	private Customer customer_details;
	private List<Orders> orders;
	
	public CustomersOrders() {
		super();
	}
	public CustomersOrders(Customer customer_details, List<Orders> orders) {
		super();
		this.customer_details = customer_details;
		this.orders = orders;
	}
	public Customer getCustomer_details() {
		return customer_details;
	}
	public void setCustomer_details(Customer customer_details) {
		this.customer_details = customer_details;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "CustomersOrders [customer_details=" + customer_details + ", orders=" + orders + "]";
	}

	
	
	
}
