//To access hidden members of base class
class M {
    int a=10,b=20;
}
class N extends M {
    int b=50, c=30;  //b hides b in class M
   public void sum(){
       int s=a+b+c;
       System.out.println(s); // 90
       int s1=a+super.b+c;
       System.out.println(s1); //60
   }
}
public class SuperUse2 {
    public static void main(String[] args) {
        N ob=new N();
        ob.sum();
    }
}
