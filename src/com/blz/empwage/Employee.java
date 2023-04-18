package com.blz.empwage;
import java.util.Scanner;

//Create multiple Companies -> Create Employees with details(name, age, phoneNumber,city,state, department)
//-> Add multiple employees in each Company 
//-> Also Maintain a dictionary of Company through a Map(key->companyName , value->Company-Object) 
//->  Create 3 classes - Company , Employee and CompanyMain
public class Employee {
			
		//Create an employee details
		private String Name, city, state, department;
		private int age;
		private long phoneNumber;
		
		Public Employee(String name, int age, long phoneNumber, String city, String state, String department) {
			this.name = name;
			this.age = age;
			this.phoneNumber = phoneNumber;
			this.city = city;
			this.state = state;
			this.department = department;
			
		}
			
		}
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}

		public long getphoneNumber() {
			return phoneNumber;
		}
		public String getCity() {
			return city;
		}
		public String getState() {
			return state;
		}
		public void  setDepartment(String department){
			this.department = department;
		} 
		
		public String toString() {
			return "Company [Name=" + name + ",Age=" + age +", PhoneNumber=" + phoneNumber +", City=" + city +", "
					+ "State=" + state + ", Department=" + department + "]";
		}
		

}
