package com.vel.constructor;

import java.util.Scanner;

public class Demo {
	
	int a;
	String s;
	int rollNo;
	 String name;
	 int id;
	double aggr;
	String cityName;
	
//	1. No Arguement Constructor	 
	
//         public Demo() {
////    	 
// a = 15;
// s = "vikas";
////    	 System.out.println(a+" and "+s);
//   }
     
//	 2. parametarized constructor
	 
	 public Demo(int a, String b) {
		 rollNo = a;
		 name = b;
		 System.out.println("the name is "+b+" and the roll number is "+rollNo);
	 }
	 


//	 3. Default Constructor
	 

	
	public static void main(String[] args) {

Demo obj = new Demo(10, "Vikas");

		
		
	}
	
   

}

//Conctructor - 3 types
// 