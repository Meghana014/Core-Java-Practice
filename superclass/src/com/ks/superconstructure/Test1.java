package com.ks.superconstructure;

public class Test1 extends Test {
	
	public Test1()
	{
	//super(); not need to write super default constructor it automatically writes by the compiler to call parent constructor
		System.out.println("default constructor from currentc class");
	}
	public static void main(String[] args) {
		new Test1();
	}

}
