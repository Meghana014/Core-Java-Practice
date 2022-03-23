package scannerclass;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("enter weight of the body(kg):");
		float weight=s.nextFloat();
		System.out.println(weight);
		
		System.out.println("enter height in (cm):");
		float height=s.nextFloat();
		System.out.println(height);
		
		float heightinmeters=height/100;
		System.out.println("height in meters:"+heightinmeters);
		
		float BMI=weight/(heightinmeters*heightinmeters);
		
		System.out.println("the BMI is:"+BMI);
		
		s.close();
		

		

	}

}
