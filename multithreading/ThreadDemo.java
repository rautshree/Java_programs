//Creating thread extending Thread class
package multithreading;

class A extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("i= "+i);
        }
    }
}

class B extends Thread {
    public void run(){
        for(int j=1;j<=10;j++){
            System.out.println("j= "+j);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        t1.start();
        t2.start();
        System.out.println("Thread one is Alive: "+t1.isAlive());
        System.out.println("Thread two is Alive: "+t2.isAlive());
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException ex){
            System.out.println(ex);
        }
        System.out.println("Thread one is Alive: "+t1.isAlive());
        System.out.println("Thread two is Alive: "+t2.isAlive());
        
        System.out.println("Main Thread Exiting.....");
    }
}
