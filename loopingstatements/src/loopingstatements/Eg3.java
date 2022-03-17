package loopingstatements;

public class Eg3 {
 int a=65;
 public static void main(String[] args)
 {  
	 Eg3 k=new Eg3();
	 System.out.println("ASCII characters are as follows:");
	 do
	 {
		 System.out.println((char)k.a+":"+k.a);
		 k.a++;
	 }while(k.a<=97);
 }
}
