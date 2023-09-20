package com.minu.oop;

public class Encap {
	
	private double salary;
	String name;
	
	public double getSalary() {
		
		return salary;
		
	}
	
	public void setSalary(double sal) {  //if salary is more than 50k, salary = 0...
		
		if(sal <= 50000) {
			salary = sal;
		System.out.println("the salary is: "+salary);
		}
		else {
			salary = 0;
			System.out.println("the salary is "+salary);
		}
		
	}

}

//1. private
//2. getter/setter