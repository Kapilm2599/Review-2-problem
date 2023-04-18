package com.blz.empwage;

import java.util.*;

public class Company {
	private String companyName;
	private List<Employee> employees;
	
	public Company(String companyName) {
		this.companyName = companyName;
		employees = new ArrayList<>();
		
	} 
	
	public String getCompanyName() {
		return companyName;
	
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public List<Employee> getEmployee(){
		return employees;
	}
	

}
