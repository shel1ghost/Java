import javax.swing.*;
import java.awt.*;

public class Components extends JPanel{
    private static JFrame f;
    private static JPanel p;
    private static JButton b;
    private static JTextField t;
    public static void main(String[]args){
        f = new JFrame("Components");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        f.setVisible(true);
        p = new JPanel();
        b = new JButton("ok");
        p.add(b);
        f.add(p);
    }
}






