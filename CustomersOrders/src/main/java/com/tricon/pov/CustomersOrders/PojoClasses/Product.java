package com.tricon.pov.CustomersOrders.PojoClasses;


public class Product {

	private String productId;
	private String productName;
	private String productType;
	private String productImageUrl;
	private Price productPrice;
	
	
	public Product() {
		super();
	}
	public Product(String productId, String productName, String productType, String productImageUrl,
			Price productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productImageUrl = productImageUrl;
		this.productPrice = productPrice;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductImageUrl() {
		return productImageUrl;
	}
	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	public Price getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Price productPrice) {
		this.productPrice = productPrice;
	}
	
	

}