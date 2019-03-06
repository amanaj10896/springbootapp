package com.tricon.pov.CustomersOrders.PojoClasses;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Order {
	
	private String id;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy HH:mm")
	private Date orderTime;
	private String customerId;
	private String paymentMode;
	private List<OrderedProduct> orderedItems;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public List<OrderedProduct> getOrderedItems() {
		return orderedItems;
	}
	public void setOrderedItems(List<OrderedProduct> orderedItems) {
		this.orderedItems = orderedItems;
	}
	public Order(String id, Date orderTime, String customerId, String paymentMode, List<OrderedProduct> orderedItems) {
		super();
		this.id = id;
		this.orderTime = orderTime;
		this.customerId = customerId;
		this.paymentMode = paymentMode;
		this.orderedItems = orderedItems;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderTime=" + orderTime + ", customerId=" + customerId + ", paymentMode="
				+ paymentMode + ", orderedItems=" + orderedItems + "]";
	}
	
	
}