package wrappers;

public class String_to_primitive {
	public static void main(String[] args) {
		String str1="28372345";
		int i=Integer.parseInt(str1);
		System.out.println("after converting string to primitive int :"+i);
		
		String str2="345";
		double d=Double.parseDouble(str2);
		System.out.println("after converting string to double:"+d);
		
	}

}
