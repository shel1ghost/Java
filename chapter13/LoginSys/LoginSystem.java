import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class PanelElements extends JPanel{
	private final JLabel l1, l2, l3, l4;
	private final JTextField t1, t2;
	private final JButton btn1, btn2;
	private final JPanel p;
	public PanelElements(){
		l1 = new JLabel("JAVA LOGIN SYSTEM");
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		t1 = new JTextField(14);
		t2 = new JTextField(14);
		btn1 = new JButton("Register");
		btn2 = new JButton("Login");
		p = new JPanel(new GridLayout(7, 1));
		p.add(l1);
		p.add(btn1);
		p.add(btn2);
		add(p, BorderLayout.CENTER);
		Register register = new Register();
		btn1.addMouseListener(register);
		Login login = new Login();
		btn2.addMouseListener(login);
	}
	private class Register extends MouseAdapter{
		public void mousePressed(MouseEvent e){
		    p.remove(btn1);
		    p.remove(btn2);
			l1.setText("REGISTER");
			p.add(l2);
			l2.setText("Username:");
			p.add(t1);
			p.add(l3);
			l3.setText("Password:");
			p.add(t2);
			p.add(btn1);
			p.add(l4);
			ValidRegister vr = new ValidRegister();
			btn1.addMouseListener(vr);
		}
	}
	private class Login extends MouseAdapter{
		public void mousePressed(MouseEvent e){
		    p.remove(btn1);
		    p.remove(btn2);
			l1.setText("LOGIN");
			p.add(l2);
			l2.setText("Username:");
			p.add(t1);
			p.add(l3);
			l3.setText("Password:");
			p.add(t2);
			p.add(btn2);
			p.add(l4);
			ValidLogin vl = new ValidLogin();
			btn2.addMouseListener(vl);
		}
	}
	private class ValidRegister extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			String username = t1.getText();
                        String password = t2.getText();
                        if(username.isEmpty() || password.isEmpty()){
                                l4.setText("Invalid Credentials!");
                        }
		}
	}
	private class ValidLogin extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			String username = t1.getText();
                        String password = t2.getText();
                        if(username.isEmpty() || password.isEmpty()){
                                l4.setText("Invalid Credentials!");
                        }
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
