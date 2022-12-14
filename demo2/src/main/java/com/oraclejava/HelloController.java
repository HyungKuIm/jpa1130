package com.oraclejava;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/") 
	public String hello(Model model) {
		// 현재시간을 구하자!
		LocalDate now = LocalDate.now();
		model.addAttribute("now", now);
		return "hi";  // 'hi' 라는 뷰 --> src/main/resources/templates/hi.html
	}
}




