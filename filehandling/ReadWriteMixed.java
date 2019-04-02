/*WAP to input id,name,salary of a person and store it into a file. 
Also display the contents after reading from file.
*/
package filehandling;
import java.io.*;
import java.util.*;

public class ReadWriteMixed {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter id,name,salary");
        int id=input.nextInt();
        String name=input.next();
        double salary=input.nextDouble();
        try{
            //writing id,name, and salary into file
            FileOutputStream fout=new FileOutputStream("d:/mixed.txt");
            DataOutputStream dout=new DataOutputStream(fout);
            dout.writeInt(id);
            dout.writeUTF(name);
            dout.writeDouble(salary);
            dout.close();
            fout.close();
            //reading from file
            FileInputStream fin=new FileInputStream("d:/mixed.txt");
            DataInputStream din=new DataInputStream(fin);
            System.out.println("Id: "+din.readInt());
            System.out.println("Name: "+din.readUTF());
            System.out.println("Salary: "+din.readDouble());
            din.close();
            fin.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
