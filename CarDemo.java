/* constructor overloading
Defining the constructor several times in a class but with different no. of 
arguments or with different type of arguments.
*/
class Car {
    private String model,color;
    private double price;
    
    Car(String model,String color,double price){    //constructor
        this.model=model;
        this.color=color;
        this.price=price;
    }
    
    Car(){
        model="BMW";
        color="Blue";
        price=10000000;
    }
    public void showCarDetails(){
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Price: "+price);
    }
}
public class CarDemo {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.showCarDetails();
        Car myCar1=new Car("Scorpio","White",5000000);
        myCar1.showCarDetails();
    }
}
