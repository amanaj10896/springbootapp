package com.tricon.pov.CustomersOrders.PojoClasses;



public class Price {
	private Double amount;
	private String currency;
	private Tax tax;

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
public Price(Double amount, String currency, Tax tax) {
	super();
	this.amount = amount;
	this.currency = currency;
	this.tax = tax;
}
public Price() {
	super();
}
@Override
public String toString() {
	return "Price [amount=" + amount + ", currency=" + currency + ", tax=" + tax + "]";
}

}