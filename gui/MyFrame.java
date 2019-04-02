//Inheritance (Is-A Relationship)
package gui;
import javax.swing.*;
public class MyFrame extends JFrame {
   
    MyFrame(){
        setTitle("This is title");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
