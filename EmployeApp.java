package com.august10;

import java.util.Scanner;

class Employee{
	int empId;
	String empName;
	int empAge;
	
		void inputempData() {
			System.out.println("Enter Employee data");

			Scanner s=new Scanner(System.in);
			
			
			
			System.out.println("Enter Employee ID ");
			empId=s.nextInt();
			
			System.out.println("Enter Employee name ");
			empName=s.next();
			
			System.out.println("Enter the Employee age ");
			empAge=s.nextInt();
			
		}
		void displayEmployeeDetails() {
			System.out.println("Employee id is "+empId);
			System.out.println("Employee name is "+empName);
			System.out.println("Employee age is "+empAge);

		}
		@Override
		public String toString() {
			return "employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
		}
		
}

public class EmployeApp {

	
	public static void main(String[] args) {

		Employee epp=new Employee();
		epp.inputempData();
		epp.displayEmployeeDetails();
		System.out.println(epp);
	}

}
