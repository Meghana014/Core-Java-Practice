package inheritance;

public class Child extends Parent {

	public static void main(String[] args) {
		Child x=new Child();
		x.delete();
		x.create();

	}
	public void delete()
	{
		System.out.println("delete method");
	}

}
