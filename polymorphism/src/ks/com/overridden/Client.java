package ks.com.overridden;

public class Client{

	 public static void main(String[] args) {
		Axis a=new Axis();
		System.out.println("rate of interest of axis bank is: "+ a.rateofinterest());
		ICICI i=new ICICI();
		System.out.println("rate of interest of icici bank is: "+i.rateofinterest());
		Bank b=new Bank();
		System.out.println("rbi bank interest is: "+b.rateofinterest());
	}
}
