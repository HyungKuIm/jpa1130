package com.oraclejava.domain;

public class Phone {
	private String name;  //폰이름 (갤럭시 와이드 6)
	private double size;  //폰사이즈(16.5)
	private String comm;  //통신방식(5G)
	private int price;  // 가격(원)
	
	public Phone() {
		super();
	}

	public Phone(String name, double size, String comm, int price) {
		super();
		this.name = name;
		this.size = size;
		this.comm = comm;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
