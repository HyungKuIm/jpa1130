package com.oraclejava.day6;

import java.io.Serializable;

// 고양이 설계서
public class Cat {  // 객체 직렬화
	private String name;  // 고양이 이름
	private int age;  // 고양이 나이
	
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
	
	
}
