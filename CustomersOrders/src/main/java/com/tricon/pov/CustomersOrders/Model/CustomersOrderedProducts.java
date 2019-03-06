package com.tricon.pov.CustomersOrders.Model;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tricon.pov.CustomersOrders.PojoClasses.Product;
import com.tricon.pov.CustomersOrders.PojoClasses.Tax;

@Component
public class CustomersOrderedProducts {
	
	
	
	private Product product;
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
	public CustomersOrderedProducts(Product product, Double amount, String currency, Tax tax, Double total,
			Date scheduledDelivery, Date arrivedDelivery, Date scheduledShipping, Date arrivedShipping) {
		super();
		this.product = product;
		this.amount = amount;
		this.currency = currency;
		this.tax = tax;
		this.total = total;
		this.scheduledDelivery = scheduledDelivery;
		this.arrivedDelivery = arrivedDelivery;
		this.scheduledShipping = scheduledShipping;
		this.arrivedShipping = arrivedShipping;
	}
	public CustomersOrderedProducts() {
		super();
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
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