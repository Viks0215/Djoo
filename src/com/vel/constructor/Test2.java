package com.vel.constructor;

public class Test2 {

	static int a = 5;
	
	
	public Test2() {
	int	c = 15;
	System.out.println(c);
	}
	
	public void getData() {
		int d = a + 10;
		System.out.println(d);
	}
	
	public static void main(String[] args) {

		Test2 obj = new Test2();
		
		obj.getData();
		System.out.println(a);

		int res = a + 5;
		System.out.println(res);
   
	}

}
