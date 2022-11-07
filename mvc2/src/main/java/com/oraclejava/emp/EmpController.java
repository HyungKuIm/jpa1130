package com.oraclejava.emp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {

	private EmpService empService;
	
	//사원 추가
	@RequestMapping("/empadd")
	public String empadd(Model model) {
		return "empadd";
	}
	
	//사원 추가 post 처리
	@RequestMapping(value="/empadd_ok", method=RequestMethod.POST)
	public String empadd_ok(@RequestParam("id") int id,
							@RequestParam("firstName") String firstName,
							@RequestParam("lastName") String lastName,
							@RequestParam("email") String email) {
		
		empService.insertEmp(id, firstName, lastName, email);
		
		return "redirect:/emplist";
	}
	
	
	//사원 목록 출력
	@RequestMapping("/emplist")
	public String emplist(Model model) {
		
		model.addAttribute("list", empService.selectEmpList());
		
		return "emplist";
	}

	@Autowired
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	
	
	
	
}
