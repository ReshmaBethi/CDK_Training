package com.set;

//comparator
public class Person implements Comparable<Person>{
	private int pId;
	private String name;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int pId,String name) {
		// TODO Auto-generated constructor stub
		this.pId=pId;
		this.name=name;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pId+"\t"+name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person person=(Person)obj;
		return person.getpId()==this.getpId();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		//return this.getpId()-o.getpId();
		return this.getName().compareTo(o.getName());
	}
}
