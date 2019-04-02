//using nested try blocks
//Exceptions of outer try can only be handled by outer catch. However,
//exceptions of inner try can be handled by inner catch as well as 
//outer catch blocks.
package exceptionhandling;
import java.util.*;
public class Exc3 {
   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=input.nextInt();
        try{
            int b=10/(a-2);
            System.out.println("b= "+b);
            try{
                int c=10/(a-5);
                System.out.println("c= "+c);
                int m[]={10,20,30,40,50};
                System.out.println(m[a]);
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Invalid array index");
            }
            
        }
        catch(ArithmeticException ex){
            System.out.println("Divide by zero");
        }
        
    }    
}
