
package multithreading;

class Customers{
    int balanceAmount=5000;
    public synchronized void withdraw(int amount){
        if(amount>balanceAmount){
            System.out.println("Insufficient balance");
            System.out.println("Waiting for Deposit");
            try{
                wait();
            }catch(Exception ex){
                System.out.println(ex);
            }
            balanceAmount-=amount;
            System.out.println("Withdraw Amount: "+amount);
            System.out.println("New Balance: "+balanceAmount);
        }
    }
    public synchronized void deposit(int amount){
        balanceAmount+=amount;
        System.out.println("Deposited Amount: "+amount);
        System.out.println("Amount After Deposit: "+balanceAmount);
        notify();
    }
}
public class InterThreadDemo {
    public static void main(String[] args) {
        Customers ob=new Customers();
        Thread t1=new Thread(new Runnable(){
           public void run(){
               ob.withdraw(10000);
           } 
        });
        
        Thread t2=new Thread(new Runnable(){
            public void run(){
                ob.deposit(20000);
            }
        });
        
        t1.start();
        t2.start();
    }
}
