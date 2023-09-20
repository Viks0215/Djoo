package com.loops;

public class Singleton {
	
	private static Singleton singletonObj = new Singleton();
	
	private Singleton() {
		
		
	}
	
	public Singleton getSingletonInstance() {
		return singletonObj;
		
	}

}
