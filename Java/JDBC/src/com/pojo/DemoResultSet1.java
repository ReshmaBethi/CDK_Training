package com.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoResultSet1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner("System.in");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdk","root", "root");
			System.out.println("Connection Established!!!");
			
			String findData="select * from employee where empid=?";
			
			PreparedStatement ps=con.prepareStatement(findData);
			
			System.out.println("Enter employee id ");
			//int empId=sc.nextInt();
			int empId=1;
			ps.setInt(1, empId);
			
			ResultSet set=ps.executeQuery();
			while(set.next()){
				String name=set.getString(1);
				int id=set.getInt("empId");
				int salary=set.getInt(3);
				String technology=set.getString("technology");
				System.out.println(name + " , "+id+" , "+salary+" , "+technology);
				Employee employee = new Employee(name,id,salary,technology);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
