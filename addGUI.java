import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addGUI {
    public static void main(String[] args) {
        ADD a= new ADD();
    }

    
}
class ADD extends JFrame implements ActionListener
{
    JTextField t1,t2;
    JButton b;
    JLabel l;
    public ADD()
    {
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b = new JButton("OK");
        l = new JLabel("Result");
        add(t1);
        add(t2);
        add(b);
        add(l);
        
        b.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(3);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int value = num1+num2;
        l.setText(value + "");
    }
}