package com.ks.hier;

public class Test {

	public static void main(String[] args) {
           Child ch=new Child();
           {
        	   ch.method1();
        	   ch.method3();
           }
          Parent p=new Parent();
          {
        	  p.method1();
        	  p.method2();
          }
	}

}
