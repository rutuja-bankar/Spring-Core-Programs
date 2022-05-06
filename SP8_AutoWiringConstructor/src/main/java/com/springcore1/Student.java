package com.springcore1;

public class Student 
{
	private Address add;
	
	public Student() {
		System.out.println("Student Def. con_or");		
	}

	public Student(Address add) {
		super();
		this.add = add;
		System.out.println("Student Para. con_or");		
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

