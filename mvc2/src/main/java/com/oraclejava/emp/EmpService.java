package com.oraclejava.emp;

import java.util.List;
import java.util.Map;

public interface EmpService {
	public List<Map<String, Object>> selectEmpList();
	public void insertEmp(int id, String firstName, 
			String lastName, String email);
}
