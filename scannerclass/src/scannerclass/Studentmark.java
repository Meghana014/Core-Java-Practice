package scannerclass;
import java.util.Scanner;
public class Studentmark {
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("enter total number of subjects:");
		int n=x.nextInt();
		System.out.println("enter student maths marks(100):");
		int m=x.nextInt();
		System.out.println("enter student computers marks:");
		int c=x.nextInt();
		System.out.println("enter student physics marks:");
		int p=x.nextInt();
		float avg_marks=(m+c+p)/n;
		System.out.println("average marks of student is: "+avg_marks);
		if(avg_marks>=90)
		{
			System.out.println("student passed with distinction");
		}
		else if((avg_marks<90)&&(avg_marks>=75))
		{
			System.out.println("student passed with first class");
		}
		else if((avg_marks<75)&&(avg_marks>=50))
		{
			System.out.println("student passed with second class");
		}
		else
		{
			System.out.println("student failed");
		}
		x.close();
	}

}
