//using multiple catch blocks
package exceptionhandling;

import java.util.*;
public class Exc2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=input.nextInt();
        try{
            int b=10/(a-2);
            System.out.println("b= "+b);
            int m[]={10,20,30,40,50};
            System.out.println(m[a]);
        }
        catch(ArithmeticException ex){
            System.out.println("Divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Invalid Array Index");
        }
    }
}
