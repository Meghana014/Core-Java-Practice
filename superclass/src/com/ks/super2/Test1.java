package com.ks.super2;

public class Test1 extends Test{

	public void create()
	{
		System.out.println("current class create method");
	}
	public void update()
	{
		System.out.println("current class update method");
	}
	public void delete()
	{
		super.create();
		System.out.println("current class delete method");
		this.create();
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.delete();
		t.create();
		t.update();
	}
}
