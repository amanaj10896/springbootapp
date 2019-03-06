package com.tricon.pov.CustomersOrders.PojoClasses;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrderedProduct {
	private String productId;
	private Double amount;
	private String currency;
	private Tax tax;
	private Double total;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date scheduledDelivery;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date arrivedDelivery;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date scheduledShipping;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date arrivedShipping;
	public OrderedProduct(String productId, Double amount, String currency, Tax tax, Double total,
			Date scheduledDelivery, Date arrivedDelivery, Date scheduledShipping, Date arrivedShipping) {
		super();
		this.productId = productId;
		this.amount = amount;
		this.currency = currency;
		this.tax = tax;
		this.total = total;
		this.scheduledDelivery = scheduledDelivery;
		this.arrivedDelivery = arrivedDelivery;
		this.scheduledShipping = scheduledShipping;
		this.arrivedShipping = arrivedShipping;
	}
	public OrderedProduct() {
		super();
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Tax getTax() {
		return tax;
	}
	public void setTax(Tax tax) {
		this.tax = tax;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Date getScheduledDelivery() {
		return scheduledDelivery;
	}
	public void setScheduledDelivery(Date scheduledDelivery) {
		this.scheduledDelivery = scheduledDelivery;
	}
	public Date getArrivedDelivery() {
		return arrivedDelivery;
	}
	public void setArrivedDelivery(Date arrivedDelivery) {
		this.arrivedDelivery = arrivedDelivery;
	}
	public Date getScheduledShipping() {
		return scheduledShipping;
	}
	public void setScheduledShipping(Date scheduledShipping) {
		this.scheduledShipping = scheduledShipping;
	}
	public Date getArrivedShipping() {
		return arrivedShipping;
	}
	public void setArrivedShipping(Date arrivedShipping) {
		this.arrivedShipping = arrivedShipping;
	}
	
	
	
	
}