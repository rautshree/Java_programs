
//Creating thread by implementing Runnable interface
package multithreading;

class AA implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("i= "+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                System.out.println(ex);
            }
        }
    }
}

class BB implements Runnable{
    public void run(){
        for(int j=1;j<=10;j++){
            System.out.println("j= "+j);
        }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
      Thread t1=new Thread(new AA());
      Thread t2=new Thread(new BB());
      t1.setPriority(10); //t1.setPriority(Thread.MAX_PRIORITY);
      t1.start();
      t2.start();
        System.out.println("priority of t1 "+t1.getPriority());
        System.out.println("priority of t2 "+t2.getPriority());
   }
}
