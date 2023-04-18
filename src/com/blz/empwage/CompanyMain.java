package com.blz.empwage;

import java.util.*;

public class CompanyMain {
	public static void main(String[] args) {
        Map<String, Company> companyMap = new HashMap<>();
        Company company1 = new Company("ABC Company");
        company1.addEmployee(new Employee("Ashish Kumar", 30, "9923115249", "Nagpur", "MH", "Sales"));
        company1.addEmployee(new Employee("Sagar Choudhary", 25, "896352417", "Pune", "MH", "Marketing"));
        company1.addEmployee(new Employee("Rahul Deshmukh", 35, "7985623210", "Mumbai", "MH", "Engineering"));
        companyMap.put(company1.getCompanyName(), company1);

  
        
    }
}
