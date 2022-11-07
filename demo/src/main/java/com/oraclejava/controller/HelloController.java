package com.oraclejava.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/{num}")
	public String index(@PathVariable("num") Integer num) {
		int total = 0;
		for (int i = 1; i <= num; i++) {
			total += i;
		}
		return "1부터 " + num + "까지 합은 " + total;
	}
}
