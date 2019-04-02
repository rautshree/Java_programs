package filehandling;
import java.io.*;
public class ReadBytes {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("d:/abc.txt");
            int ch;
            while((ch=fin.read())!=-1){
                System.out.print((char)ch);
            }
            fin.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
