package methods;

public class Instance_method_parameters {

	public void Studentprofile(int rollno,String sname)
	{
		System.out.println("rollno:"+rollno);
		System.out.println("student name:"+sname);
	}
	public void Studentdetails(long phno,String address) 
	{
		System.out.println("phonenumber:"+phno);
		System.out.println("address:"+address);
	}
	
	public static void main(String[] args)
	{
		Instance_method_parameters profile=new Instance_method_parameters();
	profile.Studentprofile(11, "meghana");
	profile.Studentdetails(4567876678l, "hyd");
	
	  
		
	}

}