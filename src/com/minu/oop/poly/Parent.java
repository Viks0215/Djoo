package com.minu.oop.poly;


public class Parent {

	  void operator(char a) {
		System.out.println("parent class method "+a);
		
	}
	
	void operator(int b) {
		System.out.println(b);
	}

	void operator(String a, String b, int c) {
		System.out.println("a + b");
	}
	
	void operator(char a, char b) {
		System.out.println(a+ " "+b);
	}
	
	void operator4(String a, int b) {
		System.out.println(a + b);
	}
	
	void operator5(int a, int b, int c) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.operator('S');
		
	}
	
		
	
}
