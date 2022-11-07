package com.oraclejava;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyNameController {

	@RequestMapping("/myName")
	public String name(Model model) {
		String name = "스타벅스 안가!";
		model.addAttribute("name", name);
		return "myName";
	}
}
