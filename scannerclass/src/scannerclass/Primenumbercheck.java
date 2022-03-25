package scannerclass;
import java.util.Scanner;
public class Primenumbercheck {

	public static void main(String[] args) {
		 
		Scanner a=new Scanner(System.in);
		System.out.println("enter an integer:");
		int num=a.nextInt();
		int count=0;
		
		
		for(int i=0 ; i<=num ; i++)
		{
			if(num%i==0)
			{
				 count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
		
		a.close();
	}
    
}
