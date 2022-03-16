
public class invoke_currentclass_method_this {
  
public static void main(String[] args) {
		
	invoke_currentclass_method_this profile = new invoke_currentclass_method_this();
		profile.m1();
		profile.m2();
		profile.m3();
	}
	
	public void m1(){
	    m3();
		System.out.println("M1 Method");
	}
	
	public  void m2(){
		System.out.println("M2 Method");
	}
	
	public void m3(){
		System.out.println("M3 Method");
	}
}
