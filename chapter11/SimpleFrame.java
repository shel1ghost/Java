import javax.swing.*;
import java.awt.*;

public class SimpleFrame{
    public static void main(String[]args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame("This is a simple frame");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(300, 200);
            f.setVisible(true);
        });
    }
}
