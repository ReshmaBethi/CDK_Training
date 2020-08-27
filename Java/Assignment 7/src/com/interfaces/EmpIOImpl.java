package com.interfaces;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Address;
import com.pojo.Employee;

public class EmpIOImpl implements EmpIO {

	Scanner sc=new Scanner(System.in);
	@Override
	public Employee readFromUser() {
		System.out.println("Enter emp id ,name ,city,state, pincode ");
		Employee emp=new Employee(sc.nextInt(),sc.next(),new Address(sc.next(),sc.next(),sc.next()));
		return emp;
	}

	@Override
	public boolean addToFile(List<Employee> employees) {
		// TODO Auto-generated method stub
		try (FileOutputStream fo=new FileOutputStream("Employee.txt");
				ObjectOutputStream oo=new ObjectOutputStream(fo);){
			//oo.writeObject(employees);
			for(Employee e:employees){
				oo.writeObject(e);
			}
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public List<Employee> readFromFile() {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<>();
		try(FileInputStream fi=new FileInputStream("Employee.txt");) {
				ObjectInputStream oi=new ObjectInputStream(fi); 
				//System.out.println(fi.available());
				/*if(fi.available()!=0){
					Object obj=oi.readObject();
					}*/
				while(fi.available()!=0){
					try {
						Object obj=oi.readObject();
						Employee emp=(Employee)obj;
						list.add(emp);
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public void displayToUser(Employee e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}

}
