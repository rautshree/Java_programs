class A{
   static int count=0;
  A(){
	count++;
	System.out.println("No.of objects: "+count);
   }
 }
public class CountObjects {
    public static void main(String args[])
	{
		A ob1=new A();
                A ob2=new A();
		A ob3=new A();
       }
}
