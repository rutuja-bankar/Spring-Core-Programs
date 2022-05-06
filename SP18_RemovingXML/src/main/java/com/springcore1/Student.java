package com.springcore1;

public class Student
{
	Address address;
	
	public Student(Address address) 
	{
		super();
		this.address = address;
	}
		
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void disp()
	{
		address.disp();
		System.out.println("Student Display");
	}
	
}
