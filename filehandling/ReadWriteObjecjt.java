
package filehandling;

import java.io.*;
class Person implements Serializable{
    private int id;
    private String name;
    private double salary;
    
    Person(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    void showInfo(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
public class ReadWriteObjecjt {
    public static void main(String[] args) {
        Person p=new Person(101,"Ram",5600);
        try{
            //writing object to file
            FileOutputStream fout=new FileOutputStream("d:/obj.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(p);
            out.close();
            fout.close();
            //reading object from file
            FileInputStream fin=new FileInputStream("d:/obj.txt");
            ObjectInputStream oin=new ObjectInputStream(fin);
            Person p1=(Person)oin.readObject();
            p1.showInfo();
            oin.close();
            fin.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
