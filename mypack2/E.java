//different package non-subclass
package mypack2;

public class E {
    E(){
        mypack1.A ob=new mypack1.A();
        System.out.println(ob.d);
        //only public member "d" allowed
    }
}
