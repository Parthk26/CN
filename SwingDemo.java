import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class SwingDemo
{
    public static void main(String[] args) 
    {    
        ABC a = new ABC();
    }
}
class ABC extends JFrame 
{
    public ABC()
    {
        JLabel l = new JLabel("hello World");
        JLabel w = new JLabel("Welcome parth");
        add(l);
        add(w);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(50, 50);
        setDefaultCloseOperation(3);
    }
}