package com.ks.abs2;

public class Client extends Profileparameters {
	public int add(int a,int b)
	{
		System.out.println("add method");
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		return a+b;
	}
	public void details(int rollno,String name)
	{
		System.out.println("rollno is: "+rollno);
		System.out.println("name is: "+name);
	}
	public static void main(String[] args)
	{
		Client c=new Client();
		
		int a=c.add(10, 20);
		System.out.println("sum of a and b is:"+a);
		c.details(101, "meghana");
	}
	

}
