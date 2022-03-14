package wrappers;

public class Object_to_string {

	public static void main(String[] args) {
           int x=12;
           Integer y=Integer.valueOf(x);
           System.out.println("after converting primitivr type to object type:"+y);
           //object to string
           String str1=y.toString();
           System.out.println(str1);  //converting object to string 
           
	}

}
