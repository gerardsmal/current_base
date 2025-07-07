package com.betacom.objects;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = 3L;
	
	
	private String street;
	private String city;
	private String name;
	private Boolean sesso;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getSesso() {
		return sesso;
	}
	public void setSesso(Boolean sesso) {
		this.sesso = sesso;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", name=" + name + ", sesso=" + sesso + "]";
	}
	
	
	

	
	
}
