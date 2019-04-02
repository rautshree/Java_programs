//Program to copy the file  d:/abc.txt into e:/abc.txt
package filehandling;
import java.io.*;
public class CopyFile {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("d:/abc.txt");
            FileOutputStream fout=new FileOutputStream("e:/abc.txt");
            int ch;
            while((ch=fin.read())!=-1){
                fout.write(ch);
            }
            fin.close();
            fout.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
