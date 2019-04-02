//By using synchronized block
package multithreading;
class Customer {
    double balanceAmount;
    void deposit(double amount){
        double newBalance=balanceAmount+amount;
        balanceAmount=newBalance;
        System.out.println("New Balance After Deposit: "+balanceAmount);
    }
}
class M extends Thread{
    Customer ob;
    M(Customer ob){
        this.ob=ob;
    }
    public void run(){
        synchronized(ob){
         ob.deposit(5000);
        }
    }
}
class N extends Thread {
    Customer ob;
    N(Customer ob){
        this.ob=ob;
    }
    public void run(){
        synchronized(ob){
        ob.deposit(10000);
        }
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        Customer ob=new Customer();
        M t1=new M(ob);
        N t2=new N(ob);
        t1.start();
        t2.start();
    }
}
