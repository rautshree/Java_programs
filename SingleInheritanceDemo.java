//Single Inheritance
//To find area of a room
class L{
    int length;
    public void setLength(int l){
        length=l;
    }
}

class B extends L {
    int breadth;
    public void setBreadth(int b){
        breadth=b;
    }
    public void area(){
        System.out.println("Area is: "+length*breadth);
    }
}
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        B ob=new B();
        ob.setLength(5);
        ob.setBreadth(4);
        ob.area();
    }
 }
