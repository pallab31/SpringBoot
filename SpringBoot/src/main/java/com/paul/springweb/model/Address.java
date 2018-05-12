package com.paul.springweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Address {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String address1;
	private String address2;
	
	
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + "]";
	}
	
	
	
	

}
