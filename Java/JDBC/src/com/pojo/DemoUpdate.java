package com.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoUpdate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdk", "root", "root");
			System.out.println("Connection Esablished ");
			
			String update="update employee set name=? where empid=?";
			PreparedStatement ps=con.prepareStatement(update);
			System.out.println("Enter name ");
			String name=sc.next();
			System.out.println("Enter id");
			int id=sc.nextInt();
			ps.setString(1, name);
			//ps.setString(1, "ABC XYZ");
			ps.setInt(2, id);
			int updated=ps.executeUpdate();
			if(updated>0){
				System.out.println("updated");
			}else{
				System.out.println("Not updated!!!");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

}
