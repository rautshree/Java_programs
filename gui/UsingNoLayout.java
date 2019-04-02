package gui;

import javax.swing.*;
public class UsingNoLayout {
    JFrame f1;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2;
    UsingNoLayout(){
        f1=new JFrame();
        f1.setLayout(null);
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1=new JLabel("Name");
        l1.setBounds(10,10,80,25);
        f1.add(l1);
        t1=new JTextField();
        t1.setBounds(100,10,160,25);
        f1.add(t1);
        l2=new JLabel("Age");
        l2.setBounds(10,45,80,25);
        f1.add(l2);
        t2=new JTextField();
        t2.setBounds(100,45,80,25);
        f1.add(t2);
        b1=new JButton("Ok");
        b1.setBounds(100,80,80,25);
        f1.add(b1);
        b2=new JButton("Cancel");
        b2.setBounds(190,80,80,25);
        f1.add(b2);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new UsingNoLayout();
    }
}
