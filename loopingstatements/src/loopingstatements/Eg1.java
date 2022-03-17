package loopingstatements;


//for loop
public class Eg1 {
   int ch=97;
  
	public static void main(String[] args)
	{
		 Eg1 k=new Eg1();
	
		System.out.println("The alphabets are as follows:");
		for(k.ch=97;k.ch<=122;k.ch++)
		{
			System.out.println((char)k.ch+":"+k.ch);
		}
	}
       
}
