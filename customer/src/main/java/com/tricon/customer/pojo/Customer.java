package com.tricon.customer.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@NotNull
	@Size(min=2, message="id should have atleast 2 characters")
	private String Id;
	
	@NotNull
	@Size(min=2, message="name should have atleast 2 characters")
	private String name;
	
	@NotNull
	@Size(min=10, message="phoneNo should have atleast 10 characters")
	private String phoneNo;
	
	@Pattern(regexp=".+@.+\\..+", message="Please provide a valid email address")
	private String email;
	
	
	
	
	public String getId() {
		return Id;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
