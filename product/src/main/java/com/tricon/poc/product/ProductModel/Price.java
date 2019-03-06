package com.tricon.poc.product.ProductModel;

public class Price {

	private double amount;
	private String currency;
	private Tax tax;
	
	
	
	public Price(double amount, String currency, Tax tax) {
		super();
		this.amount = amount;
		this.currency = currency;
		this.tax = tax;
	}
	
	
	
	
	public Price() {
		super();
	}
	
	
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
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
	
	
	
	}
