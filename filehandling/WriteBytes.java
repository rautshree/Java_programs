
package filehandling;

import java.io.*;
public class WriteBytes {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("d:/abc.txt",true);
            String s=" Java is OOP Language";
            byte []b=s.getBytes();
            fout.write(b);
            fout.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}  
