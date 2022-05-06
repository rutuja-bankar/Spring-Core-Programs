package com.springcore1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean
{
	int roll;
	String name;
	
	public void setRoll(int roll) 
	{
		System.out.println("Setting Roll");		
		this.roll = roll;
	}
	
	public void setName(String name) 
	{
		System.out.println("Setting Name");		
		this.name = name;
	}
	
	@Override
	public String toString() 
	{
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside init() Method");				
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy() Method");						
	}

	
	
}
