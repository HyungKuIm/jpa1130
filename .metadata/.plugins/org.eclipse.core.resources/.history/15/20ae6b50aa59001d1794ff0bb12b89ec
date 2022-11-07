package com.oraclejava.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oraclejava.domain.Employee;
import com.oraclejava.repository.EmpRepository;

@Controller
public class EmpController {

	private EmpRepository empRepository;

	public EmpController(EmpRepository empRepository) {
		super();
		this.empRepository = empRepository;
	}
	
	@RequestMapping("/emplist")
	public String findAll(Model model) {
		List<Employee> emps = new ArrayList<>();
		
		empRepository.findAll().forEach(e -> emps.add(e));
		
		model.addAttribute("emps", emps);
		return "emplist";
	}
}





