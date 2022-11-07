package com.oraclejava.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("SpringConfig.xml");
		Person p = (Person)ctx.getBean("hurjae");
		String name = p.getName();
		int age = p.getAge();
		PersonAddress addr = p.getAddr();
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + addr.getCity() + " " + addr.getStreet());
//		System.out.println(Math.pow(4, 2));  // 4 x 4
		ctx.close();

	}

}
