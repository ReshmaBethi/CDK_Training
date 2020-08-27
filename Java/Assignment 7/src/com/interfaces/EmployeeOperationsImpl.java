package com.interfaces;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public class EmployeeOperationsImpl implements EmployeeOperations {

	@Override
	public boolean addEmployee(Employee employee){
		// TODO Auto-generated method stub
		EmpIOImpl eio=new EmpIOImpl();
		List<Employee> li = new ArrayList<Employee>();
			li = eio.readFromFile();
		li.add(employee);
		boolean b=eio.addToFile(li);
		if(b){
			return true;
		}
		return false;
	}

	@Override
	public Employee updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		EmpIOImpl eio=new EmpIOImpl();
		List<Employee> li=new ArrayList<>();
		li=eio.readFromFile();
		for(Employee e: li){
			try{
			if(e.getEmpId()==id){
				e.setEmpName(name);
				eio.addToFile(li);
				return e;
			}
			}catch (NullPointerException en) {
				// TODO: handle exception
			}
		}
		return null;
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		EmpIOImpl eio=new EmpIOImpl();
		List<Employee> li=new ArrayList<>();
		li=eio.readFromFile();
		for(Employee e :li){
			try{
			if(e.getEmpId()==id){
				li.remove(e);
				eio.addToFile(li);
				return e;
			}
			}catch(NullPointerException ee){
				
			}
		}
		return null;
	}

	@Override
	public Employee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		EmpIOImpl eio=new EmpIOImpl();
		List<Employee> li=new ArrayList<>();
		li=eio.readFromFile();
		for(Employee e : li){
			try{
			if(e.getEmpId()==id){
				return e;
			}
			}catch(NullPointerException ee){
				
			}
		}
		return null;
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		EmpIOImpl eio=new EmpIOImpl();
		List<Employee> li=new ArrayList<>();
		li=eio.readFromFile();
		return li;
	}

}
