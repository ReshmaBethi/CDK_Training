package com.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoPreparedStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter id");
		int empId=sc.nextInt();
		System.out.println("Enter salary");
		int salary=sc.nextInt();
		System.out.println("Enter Technology");
		String technology=sc.next();
		Employee emp=new Employee(name,empId,salary,technology);
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdk", "root", "root");
			System.out.println("Got the connection");
			
			String insertData="insert into employee values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(insertData);
			ps.setString(1, emp.getName());
			ps.setInt(2, emp.getEmpId());
			ps.setInt(3, emp.getSalary());
			ps.setString(4, emp.getTechnology());
			
			int updated=ps.executeUpdate();
			if(updated>0){
				System.out.println("Row inserted successfully!!!");
			}else{
				System.out.println("Sorryy!!!");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
