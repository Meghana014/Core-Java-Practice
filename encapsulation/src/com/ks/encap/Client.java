package com.ks.encap;

public class Client extends Registeration{
	public static void main(String[] args)
	{
		Registeration r = new Registeration();
		
		 r.setEmpid(101);
		 r.setSalary(55004.76);
	    r.setEmail("abs@gmail.com");
	   r.setName("meghana");
		
		System.out.println("employee id is: "+r.getEmpid());
		System.out.println("employee salary is: "+r.getSalary());
		System.out.println("employee email is: "+r.getEmail());
		System.out.println("employee name is: "+r.getName());
	}

}
