package com.springcore1;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	private int id;
	private String name;
	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setter Method");
		this.address = address;
	}	
}

