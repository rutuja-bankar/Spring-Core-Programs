package com.springcore1;

public class Addition {
	int a,b;

	public Addition(double a, double b) 
	{
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Para. Con_or(dbl,dbl)");
	}
	
	public Addition(int a, int b) 
	{
		this.a = a;
		this.b = b;
		System.out.println("Para. Con_or(int,int)");
	}
	
	public Addition(String a, String b) 
	{
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Para. Con_or(str,str)");
	}
	
		
	void add()
	{
		System.out.println("Addtion = "+(a+b));
	}
}
