//to call base class constructor from derived class
class L1{
    int length;
    L1(int l){
        length=l;
    }
}

class B1 extends L1 {
     int breadth;
    B1(int l,int b){
        super(l);  //super must be the first statement
        breadth=b;
        
    }
    public void area(){
        System.out.println("Area is: "+length*breadth);
    }
}
public class SuperUse1 {
    public static void main(String[] args) {
        B1 ob=new B1(4,3);
        ob.area();
        
    }
}
