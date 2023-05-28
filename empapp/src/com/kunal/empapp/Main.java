package com.kunal.empapp;

import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		EmployeeDaoInterface dao=new EmployeeDaoImpl();
		System.out.println("Welcome to Employee Management Application");
		
		Scanner sc=new Scanner(System.in);
		do {
			
			System.out.println( "1. Add Employee\n" +
								"2. Show All Employees\n" +
								"3. Show Employee based on ID\n" +
								"4. Update Employee\n" + 
								"5. Delete Employee\n");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				Employee emp=new Employee();
				System.out.println("Enter ID: ");
				int id=sc.nextInt();
				
				System.out.println("Enter name: ");
				String name=sc.next();
				
				System.out.println("Enter Salary: ");
				double salary=sc.nextDouble();
				
				System.out.println("Enter Age: ");
				int age=sc.nextInt();
				 emp.setId(id);
				 emp.setName(name);
				 emp.setSalary(salary);
				 emp.setAge(age);
				 
				dao.createEmployee(emp);
				break;
			case 2:
				System.out.println("Thank you for using our application");
				System.exit(0);
			default:
				System.out.println("Enter a valid choice");
				break;
			}
			
			
			
		}while(true);
		
	}
	
}
