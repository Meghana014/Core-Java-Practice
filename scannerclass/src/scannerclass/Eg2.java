package scannerclass;
import java.util.Scanner;

public class Eg2 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter an integer");
	   int a=sc.nextInt();
	   
	   System.out.println("enter another integer:");
	   int b=sc.nextInt();
	   
	   System.out.println("sum of two integers is:"+(a+b));
	   sc.close();
	}

}
