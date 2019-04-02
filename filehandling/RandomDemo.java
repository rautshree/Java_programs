package filehandling;
import java.io.*;
public class RandomDemo {
    public static void main(String[] args) {
        try{
            RandomAccessFile rf=new RandomAccessFile("d:/random.txt","rw");
            rf.writeInt(10);
            rf.writeChar('A');
            long pos=rf.getFilePointer();
            rf.seek(0);
            System.out.println(rf.readInt());
            System.out.println(rf.readChar());
            rf.writeDouble(10.5);
            rf.writeBoolean(true);
            rf.seek(pos);
            System.out.println(rf.readDouble());
            System.out.println(rf.readBoolean());
            rf.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
