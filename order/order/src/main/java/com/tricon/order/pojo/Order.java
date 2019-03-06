package com.tricon.order.pojo;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection="order")
public class Order {
	
	@Id
	@NotNull
	@Size(min=2, message="id should have atleast 2 characters")
	private String id;
	private double total;
	@NotNull
	@Size(min=2, message="currency should have atleast 2 characters")
	private String currency;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy HH:mm")
    private Date orderTime;
	@NotNull
	@Size(min=2, message="customerId should have atleast 2 characters")
    private String customerId;
	@NotNull
	@Size(min=2, message="paymnentMode should have atleast 2 characters")
    private String paymentMode;
    private List<OrderedProduct> orderedItems;
   
    public Order() {
		super();
	}
	public Order(String id, double total, String currency, Date orderTime, String customerId, String paymentMode,
			List<OrderedProduct> orderedItems) {
		super();
		this.id = id;
		this.total = total;
		this.currency = currency;
		this.orderTime = orderTime;
		this.customerId = customerId;
		this.paymentMode = paymentMode;
		this.orderedItems = orderedItems;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", total=" + total + ", currency=" + currency + ", orderTime=" + orderTime
				+ ", customerId=" + customerId + ", paymentMode=" + paymentMode + ", orderedItems=" + orderedItems
				+ "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
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
	
    
	
	

}
