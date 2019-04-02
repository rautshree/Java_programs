//controlling main thread
package multithreading;
public class MainThreadDemo {
    public static void main(String[] args) {
        Thread t1=Thread.currentThread();
        System.out.println("priority "+t1.getPriority());
        System.out.println("Name: "+t1.getName());
        t1.setPriority(10);
        t1.setName("My New Thread");
        System.out.println("priority "+t1.getPriority());
        System.out.println("Name: "+t1.getName());
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                System.out.println(ex);
            }
        }
    }
}
