
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuDemo1 implements ActionListener{
    JFrame f1;
    JMenuBar bar;
    JMenu m1;
    JRadioButtonMenuItem r1,r2;
    JCheckBoxMenuItem c1,c2;
    MenuDemo1(){
        f1=new JFrame();
        f1.setSize(400,400);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bar=new JMenuBar();
        m1=new JMenu("File");
        r1=new JRadioButtonMenuItem("one");
        r2=new JRadioButtonMenuItem("two");
        c1=new JCheckBoxMenuItem("three");
        c2=new JCheckBoxMenuItem("four");
        //add menu to menu bar
        bar.add(m1);
        //add menu item to menu
        m1.add(r1); m1.add(r2); m1.add(c1);m1.add(c2);
        
        //add menu bar to frame
        f1.setJMenuBar(bar);
        //to open File menu using ALT+F
        r1.addActionListener(this);
        r2.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new MenuDemo1();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==r1){
            JOptionPane.showMessageDialog(null,"one");
        }
        else if(e.getSource()==r2){
            JOptionPane.showMessageDialog(null,"two");
        }
        else if(e.getSource()==c1){
            if(c1.isSelected()){
                JOptionPane.showMessageDialog(null,"three");
            }
        }
        else if(e.getSource()==c2){
            if(c2.isSelected()){
                JOptionPane.showMessageDialog(null,"four");
            }
        }
    
    }
}
