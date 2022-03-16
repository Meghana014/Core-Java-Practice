package methods;

public class Static_method_parameters
    {

	public static void Employeedetails(int eid,String ename)
	{
		System.out.println("employee id :"+eid);
		System.out.println("employee name :"+ename);
	}
	public static void EmployeeDetails(double salary,String address) {
		System.out.println("salary is:"+salary);
		System.out.println("address is:"+address);
	}
	public static void main(String[] args) {
		Static_method_parameters.Employeedetails(100, "meghana");
		Static_method_parameters.EmployeeDetails(60000.00,"chennai");
		
	}
}
