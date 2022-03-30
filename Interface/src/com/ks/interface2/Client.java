package com.ks.interface2;

public class Client implements Profile,Profile1 {

	@Override
	public void read() {
		System.out.println("read abstract method from profile1");
		
	}

	@Override
	public void display() {
		System.out.println("display abstract method from profile1");
		
	}

	@Override
	public void create() {
		System.out.println("create abstract method from profile");
		
	}

	@Override
	public void delete() {
		System.out.println("delete abstract method from profile");
		
	}

	
	
}
