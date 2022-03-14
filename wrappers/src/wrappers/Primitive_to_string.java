package wrappers;

public class Primitive_to_string {

	public static void main(String[] args) {
		int a=28683;
		String str1=Integer.toString(a);//converting primitive type to string
		System.out.println("after converting into string:"+str1);
		
		byte b=111;
		String str2=Byte.toString(b);
		System.out.println("after converting into string:"+str2);
		
	}

}
