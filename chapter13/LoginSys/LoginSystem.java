import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class PanelElements extends JPanel{
	private final JLabel l1, l2, l3;
	private final JTextField t1, t2;
	private final JButton btn1, btn2;
	private final JPanel p;
	public PanelElements(){
		l1 = new JLabel("JAVA LOGIN SYSTEM");
		l2 = new JLabel();
		l3 = new JLabel();
		t1 = new JTextField(8);
		t2 = new JTextField(8);
		btn1 = new JButton("Register");
		btn2 = new JButton("Login");
		p = new JPanel(new GridLayout(7, 1));
		p.add(l1);
		p.add(btn1);
		p.add(btn2);
		add(p, BorderLayout.CENTER);
		Register register = new Register();
		btn1.addMouseListener(register);
	}
	private class Register extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			l1.setText("REGISTER");
			p.add(l2);
			l2.setText("Username:");
			p.add(l3);
			p.add(t1);
			l3.setText("Password:");
			p.add(t2);
			p.remove(btn2);
			//l2.setText("Username:");
			//l3.setText("Password");

		}
	}
}

public class LoginSystem{
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
