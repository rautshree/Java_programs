class Customer {
    private String name,accNumber;
    private double balanceAmount;
    
    Customer(String n,String an,double b){
        name=n;
        accNumber=an;
        balanceAmount=b;
    }
    
    public void showCustomerDetails(){
        System.out.println("Customer Name: "+name);
        System.out.println("Account Number: "+accNumber);
        System.out.println("Balance Amount: "+balanceAmount);
    }
    
    public void deposit(double amount){
        balanceAmount+=amount;
        System.out.println("Amount Deposited: "+amount);
        System.out.println("New Balance Amount After Deposit: "+balanceAmount);
    }
    
    public void withdraw(double amount){
        if(balanceAmount>amount){
            balanceAmount-=amount;
            System.out.println("Amount Withdrawn: "+amount);
        System.out.println("New Balance Amount after withdraw: "+balanceAmount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Customer c1=new Customer("Ram","1001C",5000);
        c1.showCustomerDetails();
        c1.deposit(5000);
        c1.withdraw(2000);
    }
}
