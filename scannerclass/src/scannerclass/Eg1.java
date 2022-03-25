package scannerclass;
import java.util.Scanner;

public class Eg1 {
	 
	public static void main(String[] args)
	{
	Scanner k = new Scanner(System.in);
	
	System.out.println("enter employee id:");
	int id=k.nextInt();
	System.out.println("employee id is:"+id);
	
	System.out.println("enter employee name:");
	String name=k.next();
	System.out.println("employee name is:"+name);
	
	System.out.println("enter employee salary");
	double salary=k.nextDouble();
	System.out.println("employee salary is"+salary);
	
	 System.out.println("enter employee address");
	 String address=k.next();
	 System.out.println("employee address is:"+address);
	
	 k.close();
	
	}

}
