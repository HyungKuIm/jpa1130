package com.oraclejava.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MsgController {
	
	@RequestMapping("/msg")
	public String index(Model model) {
		model.addAttribute("msg", "안녕하세요 임형구님");
		return "showMessage";   // "showMessage"라는 뷰
	}
}
