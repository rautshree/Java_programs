//program to handle ArrayIndexOutOfBoundsException 
package exceptionhandling;

public class Exc1 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        try{
             System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Invalid Array Index");
        }
        finally{
           System.out.println("Thank you");
        }
    }
}
