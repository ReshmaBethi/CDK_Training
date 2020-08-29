package com.streams;

import java.util.List;

public class Developer {
	private String name;
	private int empId;
	private String technology;
	private long salary;
	private List<String> projects;
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public Developer(String name,int empId,String technology,List<String> projects,long salary) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.empId=empId;
		this.technology=technology;
		this.projects=projects;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getTechnology() {
		return technology;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", empId=" + empId + ", technology=" + technology + ", salary=" + salary
				+ ", projects=" + projects + "]";
	}
	
}
