package com.oraclejava.springcore;

//사원주소
public class PersonAddress {
	
	private String street;  // 상세주소(동호수)
	private String city; // 도로명 주소
	
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
	
	
}
