package com.blz.empwage;

//Create multiple Companies -> Create Employees with details(name, age, phoneNumber,city,state, department)
//-> Add multiple employees in each Company 
//-> Also Maintain a dictionary of Company through a Map(key->companyName , value->Company-Object) 
//->  Create 3 classes - Company , Employee and CompanyMain
public class Employee {
			
		//Create an employee details
		private String name;
		private int age;
		private long phoneNumber;
		private String city;
		private String state;
		private String department;
		
		public Employee(String name, int age, long phoneNumber, String city, String state, String department) {
			this.name = name;
			this.age = age;
			this.phoneNumber = phoneNumber;
			this.city = city;
			this.state = state;
			this.department = department;
			
		}

		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}

		public long getPhoneNumber() {
			return phoneNumber;
		}
		public String getCity() {
			return city;
		}
		public String getState() {
			return state;
		}
		public String getDepartment(){
			return department;		
		}

}
