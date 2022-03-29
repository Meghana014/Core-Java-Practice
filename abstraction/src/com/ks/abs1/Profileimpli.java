package com.ks.abs1;

public class Profileimpli extends Profile {
	public void read() 
	{
		System.out.println("read method of abstract class");
	}
	public static void main(String[] args) {
		Profileimpli k=new Profileimpli();
		k.create();       //non abstract
		k.update();        //static method
	    k.read();
		
	}
}
      
