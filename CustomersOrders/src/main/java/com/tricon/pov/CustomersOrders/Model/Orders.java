package com.tricon.pov.CustomersOrders.Model;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
public class Orders {
	
	private String orderId;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy HH:mm")
	private Date orderTime;
	private String paymentMode;
	
	private List<CustomersOrderedProducts> customersOrderedProducts;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public List<CustomersOrderedProducts> getCustomersOrderedProducts() {
		return customersOrderedProducts;
	}
	public void setCustomersOrderedProducts(List<CustomersOrderedProducts> customersOrderedProducts) {
		this.customersOrderedProducts = customersOrderedProducts;
	}
	
	
	
	public Orders(String orderId, Date orderTime, String paymentMode, List<CustomersOrderedProducts> myOrderedProducts) {
		super();
		this.orderId = orderId;
		this.orderTime = orderTime;
		this.paymentMode = paymentMode;
		this.customersOrderedProducts = myOrderedProducts;
	}
	
	public Orders(String string, Date orderTime, String paymentMode) {
		super();
		this.orderId = string;
		this.orderTime = orderTime;
		this.paymentMode = paymentMode;
	}
	public Orders() {
		super();
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderTime=" + orderTime + ", paymentMode=" + paymentMode
				+ ", myOrderedProducts=" + customersOrderedProducts + "]";
	}
	

}