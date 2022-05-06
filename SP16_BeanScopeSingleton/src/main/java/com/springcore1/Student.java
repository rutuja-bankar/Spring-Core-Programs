package com.springcore1;

public class Student
{
	String name;

	public void setName(String name) {
		System.out.println("Setting Name ...");
		this.name = name;
	}

	public String getName() {
		System.out.println("Getting Name ...");
		return name;
	}

}
