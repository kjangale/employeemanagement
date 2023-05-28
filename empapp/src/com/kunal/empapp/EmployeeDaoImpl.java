package com.kunal.empapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;


public class EmployeeDaoImpl implements EmployeeDaoInterface{

	@Override
	public void createEmployee(Employee emp) {
		Connection con = DBConnection.createDBConnection();
		String query="insert into employee values(?,?,?,?)";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setInt(1, emp.getId());
			pstm.setString(2, emp.getName());
			pstm.setDouble(3, emp.getSalary());
			pstm.setInt(4, emp.getAge());
			int cnt=pstm.executeUpdate();
			if(cnt!=0)
				System.out.println("Employee inserted successfully");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void showAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showEmployeeBasedOnID(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
