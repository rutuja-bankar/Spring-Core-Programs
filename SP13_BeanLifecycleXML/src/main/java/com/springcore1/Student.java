package com.springcore1;

public class Student {
	int roll;
	String name;
	
	public void setRoll(int roll) {
		System.out.println("Setting Roll");		
		this.roll = roll;
	}

	public void setName(String name) {
		System.out.println("Setting Name");		
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}	
	

	public void init()
	{
		System.out.println("Inside init() Method");		
	}

	public void destroy()
	{
		System.out.println("Inside destroy() Method");				
	}
}
