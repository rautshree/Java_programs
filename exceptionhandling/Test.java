package exceptionhandling;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}
class Calculate {
    void divide(double a,double b)throws MyException{
        double c=a/b;
        if(c<0.005){
            MyException ob=new MyException("Number is too small");
            throw ob;
        }
        else{
            System.out.println("Result is : "+c);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Calculate ob=new Calculate();
       try{
         ob.divide(10,5);
      }catch(MyException ex){
                System.out.println(ex);
            }
        }
    }

