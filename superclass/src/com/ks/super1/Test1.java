package com.ks.super1;

public class Test1 extends Test {
	int a=200;
	int b=300;
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.add(10,20);
	}
		

	public void add(int x,int y )
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println("current class variable a:"+this.a);
		System.out.println("current class variable b:"+this.b);
		System.out.println("parent class variable a:"+super.a);
		System.out.println("parent class variable b:"+super.b);
	}
	
}
