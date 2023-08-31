import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class PanelElements extends JPanel{
	private final JLabel l1, l2, l3, l4;
	private final JTextField t1, t2, t3;
	private final JButton btn1, btn2;
	private final JPanel p;
	public PanelElements(){
		l1 = new JLabel("Name:");
		l2 = new JLabel("Roll No:");
		l3 = new JLabel("Address:");
		l4 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		btn1 = new JButton("Register");
		btn2 = new JButton("Clear");
		p = new JPanel();
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(btn1);
		add(btn2);
		add(l4);
		RegisterStudent register = new RegisterStudent();
		btn1.addMouseListener(register);
	}
	private class RegisterStudent extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			String sname = t1.getText();
			int roll_no = Integer.parseInt(t2.getText());
			String address = t3.getText();
            System.out.println(roll_no+" "+sname+" "+address);
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
				Statement stmt = conn.createStatement();
                String sqlStmt = "INSERT INTO students VALUES("+roll_no+","+"'"+sname+"'"+","+roll_no+","+"'"+address+"'"+");";
                stmt.executeUpdate(sqlStmt);
				stmt.close();
				conn.close();
			}catch(Exception err){
				System.out.println(err);
			}
		}
	}
}

public class Students{
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

