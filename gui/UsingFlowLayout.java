package gui;

import javax.swing.*;
import java.awt.*;
public class UsingFlowLayout {
    JFrame f1;
    JButton b1,b2,b3,b4,b5;
    UsingFlowLayout(){
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        //f1.setLayout(new FlowLayout(FlowLayout.LEFT));
        //f1.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
      
        b1=new JButton("one");
        b2=new JButton("two");
        b3=new JButton("three");
        b4=new JButton("four");
        b5=new JButton("five");
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new UsingFlowLayout();
    }
}
