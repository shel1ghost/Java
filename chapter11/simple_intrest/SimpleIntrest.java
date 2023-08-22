import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PanelElements extends JPanel{
    private final JPanel p;
    private final JTextField t1, t2, t3, t4;
    private final JLabel l1, l2, l3, l4;
    private final JButton btn;
    public PanelElements(){
        l1 = new JLabel("Principle:");
        l2 = new JLabel("Time:");
        l3 = new JLabel("Rate:");
        t1 = new JTextField(8);
        t2 = new JTextField(8);
        t3 = new JTextField(8);
        btn = new JButton("Calculate");
        l4 = new JLabel("Intrest =");
        t4 = new JTextField(8);
        p = new JPanel();
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(btn);
        add(l4);
        add(t4);
        IntrestCalculator intrest = new IntrestCalculator();
        btn.addMouseListener(intrest);
    }
    private class IntrestCalculator extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            float p, t, r, si;
            p = Float.parseFloat(t1.getText());
            t = Float.parseFloat(t2.getText());
            r = Float.parseFloat(t3.getText());
            si = (p*t*r)/100;
            t4.setText(String.valueOf(si));
        }
    }
}

public class SimpleIntrest{
    public static void main(String[]args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(600, 500);
            f.setVisible(true);
            PanelElements panel = new PanelElements();
            f.add(panel);
        });
    }
}
