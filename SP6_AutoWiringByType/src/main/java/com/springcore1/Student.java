package com.springcore1;

public class Student 
{
	private Address add;
	
	public Student() {
		System.out.println("Student Def. con_or");		
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	void print()
	{
		System.out.println("Print of Student");				
	}
	
	void disp()
	{
		print();
		add.print();
	}
}

