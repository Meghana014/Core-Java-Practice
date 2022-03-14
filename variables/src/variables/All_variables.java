package variables;

public class All_variables {
	int i=67;
	boolean b=true;
	static float f=34.23f;

	public static void main(String[] args) {
		char ch='z';
		System.out.println(ch); //loacl variable 
		System.out.println(All_variables.f);   //static variables
		All_variables e=new All_variables();   //object creation for instance variables
		System.out.println(e.i);
		System.out.println(e.b);        //accessing the instance variables 
		
		

	}

}
