package typecasting;

public class Ex1_typecasting {
	public static void main(String[] args) {
	 //implicit
		byte b=126;      //1byte
		short s=b;       //2 bytes
		System.out.println(s);
		short s1=234;
		int i=s1;          //4 bytes
		System.out.println(i);
		int i1=123;
		long l=i1;         //8 bytes
		System.out.println(l);
		long l1=2746765L;
		float f=l1;         //4 bytes
		System.out.println(f);
		int i2=546;
		float f2=i2;
		System.out.println(f2);
		int i3=5463;
		double d1=i3;
		System.out.println(d1);
		
		char ch='e';
		int i4=ch;
		float f3=ch;
		double d3=ch;
		System.out.println(i4);
		System.out.println(f3);
		System.out.println(d3);
		
		
	}

}
