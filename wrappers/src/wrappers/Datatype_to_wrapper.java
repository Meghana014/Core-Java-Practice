package wrappers;
//AUTO BOXING
public class Datatype_to_wrapper  {

	public static void main(String[] args) {
             int a=20;                       // integer data type
             System.out.println(a);
             Integer i1=Integer.valueOf(a);
             System.out.println(i1);          // converting data type to wrapper class using static method
             Integer i2 = new Integer(a);
             System.out.println(i2);          // converting datatype to wrapper class using object/instance creating
             
             char ch='a';
             System.out.println(ch);
             Character ch1=Character.valueOf(ch);
             System.out.println(ch1);
             Character ch2 = new Character(ch);
             System.out.println(ch2);
             
            double d=54.3;
            System.out.println(d);
            Double d1=Double.valueOf(d);  
            System.out.println(d1);
            Double d2 =new Double(d);
            System.out.println(d2);
            
             byte b=123;
             System.out.println(b);
             Byte b1=Byte.valueOf(b);
             System.out.println(b1);
             Byte b2=new Byte(b1);
             
             boolean bl=true;
             System.out.println(bl);
             Boolean bl2=Boolean.valueOf(bl);
             System.out.println(bl2);
             Boolean bl3=new Boolean(bl2);
             System.out.println(bl3);
             
             //another method to convert into objects without using valueOf().it is advanced form
             int c=10;
             System.out.println(c);
             Integer r=c;
             System.out.println(r);
             
             
            
            
	
	}

}
