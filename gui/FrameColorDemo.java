
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrameColorDemo implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3;
    JPanel p1;
    FrameColorDemo(){
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new BorderLayout());
        
        p1=new JPanel();
        f1.add(p1);
        b1=new JButton("Red");
        p1.add(b1);
        b2=new JButton("Green");
        p1.add(b2);
        b3=new JButton("Blue");
        p1.add(b3);
                
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new FrameColorDemo();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
            p1.setBackground(Color.RED);
        else if(e.getSource()==b2)
            p1.setBackground(Color.GREEN);
        else
            p1.setBackground(Color.BLUE); 
    }
}
