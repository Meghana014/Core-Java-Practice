package com.ks.abs1;

public abstract class Profile {
	
	public void create()          //non abstract method
	{
		System.out.println("non abstract method inside the abstract class");
	}
	public abstract  void read();      //abstract method
	
	static                       //static block
	{
		System.out.println("static block inside the abstract class");
	}
	  //instance block
	{
		System.out.println("instance block inside abstract class");
	}
	public static void update()
	{
		System.out.println("static method inside the abstract class");
	}
	public Profile()     //constructor
	{
		System.out.println("constructor inside abstract class");
	}
}
  

  
