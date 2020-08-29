package com.pojo;

public class Employee {
	private String name;
	private int empId;
	private int salary;
	private String technology;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name,int empId,int salary,String technology) {
		super();
		this.name=name;
		this.empId=empId;
		this.salary=salary;
		this.technology = technology;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + ", technology=" + technology
				+ "]";
	}
}
