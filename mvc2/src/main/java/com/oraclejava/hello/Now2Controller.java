package com.oraclejava.hello;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Now2Controller {

	@RequestMapping("/now2")
	public String index(Model model) {
		model.addAttribute("currentDate", new Date());
		return "now";
	}
}
