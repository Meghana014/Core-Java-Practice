package wrappers;
//UNBOXING
public class Wrapper_to_datatype {
	public static void main(String[] args) {
		
	      Integer x= new Integer(20);
	      System.out.println(x);
	      int y=x.intValue();
	      System.out.println(y);
	      
	      
	      Character ch = new Character('r');
	      System.out.println(ch);
	      char ch1=ch.charValue();
	      System.out.println(ch1);
	      
	      Long l=new Long(635781);
	      System.out.println(l);
	      long l1=l.longValue();
	      System.out.println(l1);
	      
	      Double d=new Double(425.729);
	      System.out.println(d);
	      double d1=d.doubleValue();
	      System.out.println(d1);
	
	}

}
