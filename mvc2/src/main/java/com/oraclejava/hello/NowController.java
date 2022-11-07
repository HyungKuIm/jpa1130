package com.oraclejava.hello;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NowController {

	@RequestMapping("/now")
	public String now() {
		// 네이버에 "자바 현재(현재 시간/ 현재 위치) 시간 출력"
		LocalDate now = LocalDate.now();  //현재 날짜 ex) 2022-10-26
		LocalTime now2 = LocalTime.now(); 
		return "Now = " + now + " " + now2;
	}
}
