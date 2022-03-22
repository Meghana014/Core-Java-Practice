package operators;

public class Post_pre_incre_decre {
	//int a=19,b=34;

	public static void main(String[] args) {
		int a=19,b=34;
		
		System.out.println("pre increment of a=19 is:" + ++a);      // 1 increment
		System.out.println("pre decrement of b=34 is:" + --b);
		

		System.out.println("post increment of a=19 is:" + a++); 
		System.out.println("post decrement of b=34 is:" + b--);

		System.out.println(a++);
		System.out.println(b--);
		
		

	}

}
