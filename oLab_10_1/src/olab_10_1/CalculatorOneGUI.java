
package olab_10_1;

import javax.swing.*;
import java.awt.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JButton bn1, bn2, bn3, bn4;
    private JTextField ta1, ta2, ta3;
    private JPanel p1, p2;

    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new GridLayout(4,1));
        p1 = new JPanel();
        bn1 = new JButton("+");
        bn2 = new JButton("-");
        bn3 = new JButton("*");
        bn4 = new JButton("/");
        ta1 = new JTextField();
        ta2 = new JTextField();
        ta3 = new JTextField();
        
        fr.add(ta1);
        fr.add(ta2);
        fr.add(p1);
        fr.add(ta3);
        
        p1.add(bn1);
        p1.add(bn2);
        p1.add(bn3);
        p1.add(bn4);
        
        
        fr.setSize(300, 150);
        fr.setVisible(true);
    }
    
    
}
