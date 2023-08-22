import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PanelElements extends JPanel{
    private final JLabel l1, l2, l3, l4;
    private final JTextField t1, t2, t3, t4;
    private final JButton btn;
    private final JPanel p;
    public PanelElements(){
        l1 = new JLabel("Num1:");
        l2 = new JLabel("Num2:");
        l3 = new JLabel("Num3:");
        t1 = new JTextField(8);
        t2 = new JTextField(8);
        t3 = new JTextField(8);
        btn = new JButton("Find Greatest");
        l4 = new JLabel("Greatest:");
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
        GreatestFinder greatest = new GreatestFinder();
        btn.addMouseListener(greatest);
    }
    private class GreatestFinder extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            int num1, num2, num3, greatest;
            num1 = Integer.parseInt(t1.getText());
            num2 = Integer.parseInt(t2.getText());
            num3 = Integer.parseInt(t3.getText());
            if(num1 > num2 && num1 > num3){
                t4.setText(String.valueOf(num1));
            }else if(num2 > num1 && num2 > num3){
                t4.setText(String.valueOf(num2));
            }else{
                t4.setText(String.valueOf(num3));
            }
        }
    }
}

public class Greatest{
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
