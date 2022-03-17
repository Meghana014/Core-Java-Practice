package controlstatements;
//else if
public class Eg3 {
	int a=45;
	public static void main(String[] args)
	{
		Eg3 x=new Eg3();
		if(x.a>=80)
		{
			System.out.println("outstanding");
		}
		else if(x.a>=70&&x.a<80)
		{
			System.out.println("first class");
		}
		else if(x.a>=50&&x.a<70)
		{
			System.out.println("second class");
		}
		else if(x.a>=35&&x.a<50)
		{
			System.out.println("third class");
		}
		else
		{
			System.out.println("failed");
		}
		
	}

}
