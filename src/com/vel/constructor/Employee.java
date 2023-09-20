package com.vel.constructor;

 class Employee {
	
	private double salary;
	
	public void setSalary(double sal) {
		
		if(sal<50000) {
			salary = sal;
		}
		else {
			salary = 0;
		}		
	}
	
	public double getSalary() {
		return salary;
	}

	
	}
	
	


