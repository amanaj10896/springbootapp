package com.tricon.poc.product.ProductModel;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class ProductModel {
	
@Id
@NotNull
@Size(min=2, message="productId should have atleast 2 characters")
private String productId;
@NotNull
@Size(min=2, message="productId should have atleast 2 characters")
private String productName;
private String productType;

private Price productPrice;
@NotNull
private String productImageUrl;







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
public Price getProductPrice() {
	return productPrice;
}
public void setProductPrice(Price productPrice) {
	this.productPrice = productPrice;
}
public String getProductImageUrl() {
	return productImageUrl;
}
public void setProductImageUrl(String productImageUrl) {
	this.productImageUrl = productImageUrl;
}


}
