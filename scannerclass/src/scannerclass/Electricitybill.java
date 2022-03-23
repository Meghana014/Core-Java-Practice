package scannerclass;
import java.util.Scanner;
public class Electricitybill {

	public static void main(String[] args) {
		Scanner y=new Scanner(System.in);
		System.out.println("enter number of units:");
		int units=y.nextInt();
		System.out.println("number of units are:"+units);
		if(units<=50)
		{
			float bill=units*(0.5f);
           System.out.println("the amount of bill is:"+bill);
	    }
		else if(units>50 && units<=100)
		{
			float bill=units*(0.75f);
			System.out.println("the amount of bill:"+bill);
		}
		else if(units>100 && units<=150)
		{
			float bill=units*(1.5f);
			System.out.println("the amount of bill:"+bill);
		}
		

	}

}
