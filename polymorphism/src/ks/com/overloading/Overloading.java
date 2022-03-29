package ks.com.overloading;

public class Overloading {
 
	public void m1(int a)
	{
		System.out.println("int type with m1 method");
	}
	public void m1(float b,int c)
	{
		System.out.println(" m1 has two arguments with float and int");
	}
	public void m1(String ch)
	{
		System.out.println("m1 has string");
	}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.m1(10);
		o.m1("hai");
		o.m1(20.5f,20);
	}

}
