import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class PanelElements extends JPanel{
    private final JPanel p;
    private final JLabel l1, l2, l3, l4;
    private final JTextField t1, t2;
    private final JButton btn1, btn2;
    public PanelElements(){
        p = new JPanel(new GridLayout(8, 1, 16, 10));
        //p.setBackground(Color.red);
        l1 = new JLabel("<3 JAVA LOVE CALCULATOR <3");
        l1.setFont(new Font("Serif Italic", Font.BOLD, 24));
        l1.setForeground(Color.red);
        l2 = new JLabel("Enter your name: ");
        l2.setFont(new Font("Serif", Font.PLAIN, 18));
        l3 = new JLabel("Enter your partner's name: ");
        l3.setFont(new Font("Serif", Font.PLAIN, 18));
        l4 = new JLabel();
        l4.setFont(new Font("Serif", Font.BOLD, 18));
        l4.setForeground(Color.red);
        t1 = new JTextField(8);
        t1.setFont(new Font("Serif", Font.PLAIN, 18));
        t2 = new JTextField(8);
        t2.setFont(new Font("Serif", Font.PLAIN, 18));
        btn1 = new JButton("Calculate");
        btn1.setFont(new Font("Serif", Font.BOLD, 18));
        btn2 = new JButton("Clear");
        btn2.setFont(new Font("Serif", Font.BOLD, 18));
        add(p, BorderLayout.CENTER);
        p.add(l1);
        p.add(l2);
        p.add(t1);
        p.add(l3);
        p.add(t2);
        p.add(btn1);
        p.add(btn2);
        p.add(l4);
        Calculator c = new Calculator();
        btn1.addMouseListener(c);
        Clear clr = new Clear();
        btn2.addMouseListener(clr);
    }
    private class Calculator extends MouseAdapter{
        public void mousePressed(MouseEvent e){
          String n1 = t1.getText();
          String n2 = t2.getText();
          if(n1.isEmpty() | n2.isEmpty()){
            l4.setText("Please enter name!");
          }else{
            Random num = new Random();
            int value = num.nextInt(51)+50;
            l4.setText("<3 Congrats! Your love is "+value+"% strong <3");
          }
        }
    }
    private class Clear extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            t1.setText("");
            t2.setText("");
            l4.setText("");
        }
    }
}

public class LoveCalculator{
    public static void main(String[]args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame();
            f.setVisible(true);
            f.setSize(500, 400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            PanelElements panel = new PanelElements();
            f.add(panel);
        });
    }
}
