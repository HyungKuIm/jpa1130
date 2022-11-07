package com.oraclejava.springcore2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("우영우");
		person.setAge(30);
		person.setAddr(jejuAddress());
		return person;
	}
	
	@Bean
	public PersonAddress guroAddress() {
		PersonAddress guroAddress = new PersonAddress();
		guroAddress.setCity("구로구 디지털로 30길");
		guroAddress.setStreet("LG 아파트 102동 1201호");
		return guroAddress;
	}
	
	@Bean
	public PersonAddress jejuAddress() {
		PersonAddress jejuAddress = new PersonAddress();
		jejuAddress.setCity("제주시 서광로 22길");
		jejuAddress.setStreet("도남e편한세상2차 101-202");
		return jejuAddress;
		
	}
}




