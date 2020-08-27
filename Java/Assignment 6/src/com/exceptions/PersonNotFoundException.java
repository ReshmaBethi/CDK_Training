package com.exceptions;

public class PersonNotFoundException extends Exception{
	String message;
	public PersonNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public PersonNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void display(){
		System.out.println("Person not found");
	}

}
