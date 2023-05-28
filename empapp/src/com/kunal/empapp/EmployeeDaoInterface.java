package com.kunal.empapp;

public interface EmployeeDaoInterface {

	//create Employee
	public void createEmployee(Employee emp);
	//show All Employee
	public void showAllEmployee();
	//show Employee based on id
	public void showEmployeeBasedOnID(int id);
	//update Employee
	public void updateEmployee(int id, String name);
	//delete Employee
	public void deleteEmployee(int id);
}
