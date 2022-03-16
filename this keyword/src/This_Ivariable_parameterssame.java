
public class This_Ivariable_parameterssame {
	String firstname;
	String lastname;
	long phno;
	double salary;
	public void details(String firstname,String lastname,long phno,double salary)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.phno=phno;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("firstname:"+firstname+" "+"lastname:"+lastname+" "+"phno:"+phno+" "+"salary:"+salary);
	}
	
	public static void main(String[] args)
	{
		This_Ivariable_parameterssame k=new This_Ivariable_parameterssame();
		k.details("meghana","mullangi" ,2345655, 140888.99);
	    k.display();
	}

}
