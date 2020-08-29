package com.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoDelete {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdk","root","root");
			System.out.println("Got connection");
			String deleteData="delete from employee where name=?";
			
			PreparedStatement ps=con.prepareStatement(deleteData);
			System.out.println("Enter name to delete ");
			String name=sc.next();
			ps.setString(1, name);
			int deleted=ps.executeUpdate();
			if(deleted>0){
				System.out.println("Successfully deleted!!");
			}else{
				System.out.println("Sorryyy!!!");
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		

	}

}
