package com.ks.interface1;

public class Client implements Profile {

	@Override
	public void create() {
       System.out.println("create method");
	}

	@Override
	public void delete() {
		System.out.println("delete method");

	}

}
