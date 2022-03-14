package methods;

public class Static_method {
	public static void main(String[] args) {
		Static_method eg=new Static_method();
		eg.createAccount();
		eg.deleteAccount();
		
		
	}
	public void createAccount(){
		int a=22;
		System.out.println(a);
		}
	public void deleteAccount() {
		System.out.println("delete account");
	}

}
