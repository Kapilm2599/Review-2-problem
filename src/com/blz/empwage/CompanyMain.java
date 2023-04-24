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
	
	Company company2 = new Company("XYZ Company");
        company2.addEmployee(new Employee("Alice Lee", 27, "555-3456", "Los Angeles", "CA", "Sales"));
        company2.addEmployee(new Employee("Mike Chen", 32, "555-7890", "San Francisco", "CA", "Engineering"));
        company2.addEmployee(new Employee("Karen Davis", 29, "555-2345", "Seattle", "WA", "Marketing"));
        companyMap.put(company2.getCompanyName(), company2);

        // print the employees of each company
        for (String companyName : companyMap.keySet()) {
            Company company = companyMap.get(companyName);
            System.out.println("Employees of " + company.getCompanyName() + ":");
            for (Employee employee : company.getEmployee()) {
                System.out.println(employee.getName() + " (" + employee.getDepartment() + ")");
            }
            System.out.println();      
         }
        
    }
}
