package com.loops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Singleton2 implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private static Singleton2 singletonObject;
	
	private Singleton2() {
		
	}
	
	public static Singleton2 getSingleton2Instance() {

		synchronized (Singleton2.class) {
			if (singletonObject == null) {

				singletonObject = new Singleton2();
			} else {
				return singletonObject;
			}

		}

		return singletonObject;

	}
	
	protected Object readResolve() {
		return singletonObject;
	}
		
	protected Object clone() throws CloneNotSupportedException {
		return singletonObject;
		
	}

	public static void main(String[] args) throws FileNotFoundException, Exception {
		try {
			Singleton2 obj1 = Singleton2.getSingleton2Instance();
//			Singleton2 obj2 = (Singleton2) obj1.clone();
//			
//			System.out.println(obj1.hashCode());
//			System.out.println(obj2.hashCode());
			
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\91983\\Desktop\\Sample.txt"));
			
			outputStream.writeObject(obj1);
			outputStream.close();
			
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\91983\\Desktop\\Sample.txt"));
			Singleton2 obj2 = (Singleton2) inputStream.readObject();
			inputStream.close();
			
			System.out.println(obj1.hashCode());
			System.out.println(obj2.hashCode());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
