class Calculate{
    static void sum(int a,int b){
        System.out.println("Sum: "+(a+b));
    }
    static int multiply(int a,int b){
        return a*b;
    }
}
public class StaticMethodDemo {
   // int b=20;
    public static void main(String[] args) {
        int a=110;
        //System.out.println(b);
//        Calculate.sum(4,4);
//        System.out.println("Product: "+ Calculate.multiply(4,6));
    }
}
