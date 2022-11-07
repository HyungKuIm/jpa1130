package com.oraclejava.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NowController {

	@RequestMapping("/now")
	public String index(Model model) {
		model.addAttribute("currentDate", new Date());
		
		model.addAttribute("contents", "now :: frag_body");
		return "index";
	}
}
