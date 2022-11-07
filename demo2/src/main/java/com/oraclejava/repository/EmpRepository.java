package com.oraclejava.repository;

import com.oraclejava.domain.Employee;

public interface EmpRepository {
	Iterable<Employee> findAll();
}
