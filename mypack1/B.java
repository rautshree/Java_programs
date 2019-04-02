//same package subclass
package mypack1;

public class B extends A{
    B(){
        System.out.println(b+" "+c+" "+d);
        //private member "a" cannot be accessed
    }
}
