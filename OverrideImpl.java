//Implementation of Method Overriding
abstract class Shape {
    double dim1,dim2;
    Shape(double d1,double d2){
        dim1=d1;
        dim2=d2;
    }
    public abstract void area();
 }

class Rectangle extends Shape {
    Rectangle(double d1,double d2){
        super(d1,d2);
    }
    public void area(){
        System.out.println("Area of rectangle: "+dim1*dim2);
    }
}

class Triangle extends Shape {
    Triangle(double d1,double d2){
        super(d1,d2);
    }
    public void area(){
        System.out.println("Area of triangle: "+0.5*dim1*dim2);
    }
}
public class OverrideImpl {
    public static void main(String[] args) {
        
        Shape r=new Rectangle(4.3,5.6);
        r.area();
        Triangle t=new Triangle(3.5,6.7);
        t.area();             
    }
}
