package com.oraclejava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 사용자에게 어떤 메시지를 출력하는 컨트롤러
@Controller
public class MsgController {

	@RequestMapping("/msg")
	public String index(Model model) {
		
		model.addAttribute("msg", "안녕하세요");
		
		model.addAttribute("contents", "msgView :: frag_body");
		return "index";
	}
}
