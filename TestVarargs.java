//Overloading varargs method


public class TestVarargs {
    	static void test(int ...a)
	{
	    for(int m:a)
	    {
		System.out.print(m+" ");
	    }
	   System.out.println();
	}	
        
        static void test(String ...a)
	{
	    for(String m:a)
	    {
		System.out.print(m+" ");
	    }
	   System.out.println();
	}	
        
	public static void main(String []args)
	{
		test(1,2,3,4);
	        test("Ram","Hari");
               // test();  creates ambiguity               
        }
}
