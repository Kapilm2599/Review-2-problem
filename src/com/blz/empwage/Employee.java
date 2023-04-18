package com.blz.empwage;
import java.util.Scanner;

//Create multiple Companies -> Create Employees with details(name, age, phoneNumber,city,state, department)
//-> Add multiple employees in each Company 
//-> Also Maintain a dictionary of Company through a Map(key->companyName , value->Company-Object) 
//->  Create 3 classes - Company , Employee and CompanyMain
public class Employee {
	
	
	public static void main(String[] args) {
		
		//Create an employee details
		private String name, city, state, department;
		private int age;
		private long phoneNumber;
		
		public String getName() {
			return name;
		}
		public void  setName(String name){
			this.name = name;
		} 
		
		public int getAge() {
			return age;
		}
		public void setAge (String age) {
			this.age = age;
		}
		
		public long getphoneNumber() {
			return phoneNumber;
		}
		public void getPhoneNumber(long phoneNumber) {
			this.PhoneNumber = phoneNumber;
		}
		
		public String getCity() {
			return city;
		}
		public void  setCity(String city){
			this.city = city;
		} 
		
		public String getState() {
			return state;
		}
		public void  setState(String state){
			this.state = state;
		} 
		
		public String getDepartment() {
			return department;
		}
		public void  setDepartment(String department){
			this.department = department;
		} 
		
		public String toString() {
			return "Company [Name=" + name + ",Age=" + age +", PhoneNumber=" + phoneNumber +", City=" + city +", "
					+ "State=" + state + ", Department=" + department + "]";
		}
		

}
