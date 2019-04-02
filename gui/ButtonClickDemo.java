
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonClickDemo implements ActionListener {
    JFrame f1;
    JTextField t1;
    JButton b1,b2;
    ButtonClickDemo(){
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        
        t1=new JTextField(10);
        f1.add(t1);
        b1=new JButton("Ok");
        f1.add(b1);
        b2=new JButton("clear");
        f1.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new ButtonClickDemo();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
            t1.setText("Hello");
        else if(e.getSource()==b2)
            t1.setText("");
    }
}
