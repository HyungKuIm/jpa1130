package com.oraclejava.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello/{num}")  // 사용자가 http://localhost:7090/mvc2/hello/11
	public String index(@PathVariable Integer num) { // index라는 메소드로 들어온다!

		int total = 0;
		for (int i=1; i<=num; i++) {
			total += i;
		}
		return "1 to " + num + " sum is " + total;
	}
}
