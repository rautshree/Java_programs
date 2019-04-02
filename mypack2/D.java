//Different package subclass
package mypack2;
import mypack1.A;
public class D extends A{
    D(){
        System.out.println(c+" "+d);
        //private member "a" and default member "b" not allowed
    }
}
