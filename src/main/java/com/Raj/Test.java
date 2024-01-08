package com.Raj;

import java.util.Arrays;

public class Test {
	public String[] courses;
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	public Test(String []courses) {
		
		this.courses=courses;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(courses);
	}

}
