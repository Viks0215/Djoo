package com.minu.inheritance;

public class Child extends Parent {
	 
    int b = 30;
	int c = 40;
	
	void m2() {
			System.out.println("this is m2 from Child");
		}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1(); //parnt
		
		System.out.println(obj.a); //10
		System.out.println(obj.b); //30
		System.out.println(obj.c); //40
		obj.m2(); // child
		
//		Parent obj = new Parent();
		
//		System.out.println(obj.a);
////		System.out.println(obj.b);
//		obj.m1();
		
		obj.m1();
		
		
		 
	}
}
