//same package non-subclass
package mypack1;

public class C {
    C(){
        A ob=new A();
        System.out.println(ob.b+" "+ob.c+" "+ob.d);
        //private member "a" cannot be accessed
    }
}
