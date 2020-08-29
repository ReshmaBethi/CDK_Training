package com.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoResultSet2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdk","root","root");
			System.out.println("Connection established");
			String findData="select * from employee";
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery(findData);
			
			while(rs.next()){
				String name=rs.getString(1);
				int empId=rs.getInt("empid");
				int salary=rs.getInt("salary");
				String technology=rs.getString("technology");
				System.out.println(name+" , "+empId+" , "+salary+" , "+technology);
				Employee emp=new Employee(name,empId,salary,technology);
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
