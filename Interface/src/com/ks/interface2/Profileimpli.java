package com.ks.interface2;

public class Profileimpli extends Client{

	public static void main(String[] args)
	{
		Profileimpli p=new Profileimpli();
		p.read();
		p.display();
		p.create();
		p.delete();
	}
}
