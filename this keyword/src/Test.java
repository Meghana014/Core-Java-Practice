
public class Test {
	public void m1()
	{
		System.out.println(this);
	}
	
	
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t);
		t.m1();
	}

}
