package com.oraclejava.springcore2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person = (Person)context.getBean("person");
		System.out.println("이름: " + person.getName());
		System.out.println("나이: " + person.getAge());
		PersonAddress addr = person.getAddr();
		System.out.println("주소: " + addr.getCity() + " " + addr.getStreet());
		
		context.close();

	}

}
