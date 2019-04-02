class Testt
{
	public void check() {
		System.out.println("Hello");
	}
	
	public void check(int a)
	{
	       System.out.println(a);
	}
	
	public void check(String a)
	{
	     System.out.println(a);
	}
	public int check(int a,int b)
	{
		return a*b;
	}
 }
public class OverloadDemo {
	public static void main(String args[])
	{
	   Testt ob=new Testt();
	   ob.check();
	   ob.check("Hi");
	   ob.check(5);
	  System.out.println(ob.check(5,4));
	}
}	 