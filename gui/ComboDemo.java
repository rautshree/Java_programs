
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComboDemo implements ItemListener{
    JFrame f1;
    JComboBox cb1;
    JTextField t1;
    ComboDemo(){
        f1=new JFrame();
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(300,300);
        String items[]={"Tea","Coffee","Hot Lemon","Coke","Fanta","Dew"};
        cb1=new JComboBox(items);
        f1.add(cb1);
        cb1.setMaximumRowCount(5);
        cb1.addItemListener(this);
        t1=new JTextField(10);
        f1.add(t1);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new ComboDemo();
    }
    public void itemStateChanged(ItemEvent e){
        t1.setText(cb1.getSelectedItem()+"");
    }
}
