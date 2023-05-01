
package olab_10_1;

import javax.swing.*;
import java.awt.*;

public class TellerGUI {
    private JFrame fr;
    private JButton bn1, bn2, bn3;
    private JTextField ta1, ta2;
    private JLabel lb_1, lb_2, lb_3;
    private JPanel p1, p2;
    
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(2,1));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(2,2,5,5));
        
        p2 = new JPanel();
        
        lb_1 = new JLabel("  Balanece");
        lb_2 = new JLabel("  Amount");
        lb_3 = new JLabel("6000");
        
        //ta1 = new JTextField("6000");
        ta2 = new JTextField();
        
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        
        fr.add(p1);
        fr.add(p2);
        
        p1.add(lb_1);
        p1.add(lb_3);
        p1.add(lb_2);
        p1.add(ta2);
        
        p2.add(bn1);
        p2.add(bn2);
        p2.add(bn3);
        
        fr.setSize(300,250);
        fr.setVisible(true);
    }
}
