package com.oraclejava.domain;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	
	private Integer employeeId; // 사번
	private String firstName; //이름
	private String lastName; // 성
	private String email; // 이mail
	private String phoneNumber; // 폰넘버
	private Date hireDate; // 입사일
	private String jobId; // 잡 아이디
	private Double salary; // 급여
	private Double commissionPct;  // 수당(건당 퍼센트 비율)
	private Integer managerId; // 매니저 id
	private Integer departmentId; // 부서 id
	
	public Employee(Integer employeeId, String firstName, String lastName, String email, String phoneNumber,
			Date hireDate, String jobId, Double salary, Double commissionPct, Integer managerId, Integer departmentId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.commissionPct = commissionPct;
		this.managerId = managerId;
		this.departmentId = departmentId;
	}
	public Employee() {
		super();
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(Double commissionPct) {
		this.commissionPct = commissionPct;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	

}
