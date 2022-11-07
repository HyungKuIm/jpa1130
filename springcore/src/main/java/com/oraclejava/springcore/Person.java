package com.oraclejava.springcore;



//사원
public class Person {

	private String name;  //이름
	private int age; // 나이
	private PersonAddress addr;  // 사원주소
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public PersonAddress getAddr() {
		return addr;
	}

	public void setAddr(PersonAddress addr) {
		this.addr = addr;
	}
	
	
	
	
}
