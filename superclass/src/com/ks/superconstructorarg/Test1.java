package com.ks.superconstructorarg;

public class Test1 extends Test{
  
	public Test1(int x) {
		super(10, 200);   //calling parent constructor
		System.out.println("current class x:"+x);
	}
	
	public static void main(String[] args) {
		
		new Test1(100);
	}
	
}
