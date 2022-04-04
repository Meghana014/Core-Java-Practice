package com.ks.enums;

public enum Bikes {
	
	honda,yamaha,bajaj;
	public static void main(String[] args) {
		Bikes v[]=Bikes.values();
		for(Bikes b:v) {
			System.out.println(b.ordinal()+ " "+b);
		}
		Bikes a=Bikes.valueOf("honda"); //valueof uses to check whether the object is present or not
	System.out.println(a);
	}

}
