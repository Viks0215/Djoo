package com.minu.oop.poly;

public class Child extends Parent{
	
	void operator(char a) {
		System.out.println("child class method "+a);
		
	}
	
	void operator1(String a, String b) {
		System.out.println(a + b);
	}

	void operator2(String a, String b, int c) {
		System.out.println("a + b");
	}
	
	void operator3(char a, char b) {
		System.out.println(a+ " "+b);
	}
	
	void operator4(String a, int b) {
		System.out.println(a + b);
	}
	
	void operator5(int a, int b, int c) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.operator('s');
		
	}
	
	
	
}

