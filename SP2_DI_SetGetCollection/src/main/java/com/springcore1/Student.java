package com.springcore1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student 
{
	private String studentName;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> courses;
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", phones=" + phones + ", addresses=" + addresses + ", courses="
				+ courses + "]";
	}
		
	
	
	
}

