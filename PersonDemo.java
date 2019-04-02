/*
Use of "this" operator
-->When the name of instance variables and function parameters are same, "this" operator is
use. 
-->"this" represents object
*/
class Person{
    private int id;
    private String name;
    private double salary;
    
    public void setInfo(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    public void showInfo(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
public class PersonDemo {
    public static void main(String[] args) {
        Person p=new Person();
        p.setInfo(1,"Ram",2500);
        p.showInfo();
    }
}

/*Note: In above program, we are able to access the members of Person class
inside another class PersonDemo directly. However, in real time application such 
direct access may cause problem. To solve this, we make all the instance variables "private"
and define "public" methods to access them.
*/
