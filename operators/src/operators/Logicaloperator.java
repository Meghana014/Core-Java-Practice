package operators;

public class Logicaloperator {

	public static void main(String[] args) {
          int a=10,b=20,c=30,d=10;
         //logical AND.if both are true then true otherwise false
          System.out.println("----logical AND----");
          System.out.println((a>b)&&(a==d));
         System.out.println((a==d)&&(a<b));
         System.out.println((a!=c)&&(a==c));
         System.out.println((b<c)&&(b==c));
         //logical OR.if any one of the expression is true then true
         System.out.println("----logical OR----");
         System.out.println((a>b)||(a==d));
         System.out.println((a==d)||(a<b));
         System.out.println((a!=c)||(a==c));
         System.out.println((b<c)||(b==c));	
         System.out.println("----logical not----");
         System.out.println(!((a>b)&&(a==d)));
         System.out.println(!((a==d)&&(a<b)));
         System.out.println(!((a!=c)&&(a==c)));
         System.out.println(!((b<c)&&(b==c)));

	}
}
