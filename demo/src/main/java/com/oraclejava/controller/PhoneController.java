package com.oraclejava.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oraclejava.domain.Phone;

@Controller
@RequestMapping("/phone")
public class PhoneController {
	
	@RequestMapping
	public String index(Model model) {
		Phone phone = new Phone("아이폰 14", 15.4, "5G", 1243000);
		model.addAttribute("phone", phone);
		model.addAttribute("contents", "phoneView :: frag_body");
		return "index";
	}
	
	@RequestMapping("/list")   // /phone/list
	public String phoneList(Model model) {
		List<Phone> phonelist = new ArrayList<>();
		phonelist.add(new Phone("갤럭시 와이드6", 16.5, "5G", 349800));
		phonelist.add(new Phone("갤럭시 Z 플립1", 6.5, "5G", 1349800));
		phonelist.add(new Phone("갤럭시 Z 플립2", 7.5, "5G", 2349800));
		phonelist.add(new Phone("갤럭시 Z 플립3", 8.5, "5G", 349800));
		model.addAttribute("phonelist", phonelist);
		model.addAttribute("contents", "phoneList :: frag_body");
		return "index";
	}
	
}
