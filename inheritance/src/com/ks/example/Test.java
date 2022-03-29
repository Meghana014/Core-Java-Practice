package com.ks.example;

public class Test {
	public static void main(String[] args)
	{
		
		Rectangle r=new Rectangle();
		r.values(20,30);
		double areaofrectangle = r.area();
		System.out.println("area of rectangle is: "+areaofrectangle);
	    
		
		Triangle t=new Triangle();
		t.values(6,12);
	    double areaoftriangle=t.area();
		System.out.println("area of triangle is: "+areaoftriangle); 
	}

}
