
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuDemo implements ActionListener{
    JFrame f1;
    JMenuBar bar;
    JMenu m1;
    JMenuItem mi1,mi2;
    MenuDemo(){
        f1=new JFrame();
        f1.setSize(400,400);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bar=new JMenuBar();
        m1=new JMenu("File");
        mi1=new JMenuItem("New");
        mi2=new JMenuItem("Exit");
        
        //add menu to menu bar
        bar.add(m1);
        //add menu item to menu
        m1.add(mi1);
        m1.add(mi2);
        //add menu bar to frame
        f1.setJMenuBar(bar);
        //to open File menu using ALT+F
        m1.setMnemonic('F');
        //to create shortcut CTRL+N for mi1
        mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK));
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new MenuDemo();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==mi1){
            new ASMD();
        }
        else{
            f1.dispose();
        }
    }
}
