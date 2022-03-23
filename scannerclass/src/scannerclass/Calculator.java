package scannerclass;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=x.nextInt();
		System.out.println("a value is:"+a);
		System.out.println("enter b value:");
		int b=x.nextInt();
		System.out.println("b value is:"+b);
		System.out.println("1.addition  2.subtraction  3.multiplication   4.division   5.modulodivision");
		System.out.println("enter your choice:");
		int choice=x.nextInt();
		System.out.println("choice is:"+choice);
		while(choice<=4)
		{
		switch(choice)
		{
		case 1:System.out.println("addition is:"+(a+b));
		        break;
		case 2:System.out.println("subtraction is  is:"+(a-b));
               break;
		case 3:System.out.println("multiplication is:"+(a*b));
               break; 
		case 4:System.out.println("division is:"+(a/b));
               break;
		case 5:System.out.println("modulo division is:"+(a%b));
               break;
		}
		  choice++;
		}
		

	}

}
