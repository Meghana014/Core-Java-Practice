package ks.com.overloading;

public class Egusing_constructors {
	public Egusing_constructors(int a)
	{
		System.out.println("integer: "+a);
	}
	public Egusing_constructors(float b,String c)
	{
		System.out.println("float and string values are:"+b+" "+c);
	}
	public Egusing_constructors(float f)
	{
		System.out.println("float is: "+f);
	}

	public static void main(String[] args) {
		new Egusing_constructors(10);
		new Egusing_constructors (20.6f,"hai");
		new Egusing_constructors (12.67f);
	

	}

}
