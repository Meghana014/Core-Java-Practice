package methods;

public class Instance_method {
	public static void main(String[] args) {                                //method
	Instance_method eg1=new Instance_method();
	eg1.createAccount();
	eg1.alterAccount();
	}

 public void createAccount() {                         //method
	 System.out.println("account created");
 }
 public void alterAccount()                      //method
 {
	 char ch='s';
	 System.out.println(ch);
 }
}
