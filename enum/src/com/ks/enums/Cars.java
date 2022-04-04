package com.ks.enums;

public enum Cars {
	honda,ford,bmw,tata;
	public static void main(String[] args) {
		Cars v[]=Cars.values();
		for(Cars c:v)      
		{
			System.out.println(c.ordinal()+" "+c);        //use ordinal() for index position
		}
		//System.out.println(v);   displays address
	}

}
