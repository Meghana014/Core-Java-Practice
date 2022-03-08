package datatypes;

import java.lang.reflect.Array;
import java.util.Collections;

public class Tocheck_primitivity {
	public static void main(String[] args) {
		Class<Byte> b=byte.class;
		System.out.println(b.isPrimitive());
		Class<Integer> i=int.class;
		System.out.println(i.isPrimitive());
		Class<Character> ch=char.class;
		System.out.println(ch.isPrimitive());
		Class<Double> d=double.class;
		System.out.println(d.isPrimitive());
		Class<Float> f=float.class;
		System.out.println(f.isPrimitive());
		Class<Long> l=long.class;
		System.out.println(l.isPrimitive());
		Class<Short> s=short.class;
	    System.out.println(s.isPrimitive());
		Class<Boolean> b1=boolean.class;
		System.out.println(b1.isPrimitive());
		Class<Array> a1=Array.class;
		System.out.println(a1.isPrimitive());
		Class<String> s1=String.class;
		System.out.println(s1.isPrimitive());
		Class<Collections> c1=Collections.class;
		System.out.println(c1.isPrimitive());
		
		
		
		
		
		
		
		
	}

}
