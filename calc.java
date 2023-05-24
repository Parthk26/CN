import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calc {
    public static void main(String[] args) {
        AddSub as = new AddSub();
    }
}
class AddSub extends JFrame implements ActionListener
{
    JTextField t1,t2;
    JButton b1,b2;
    JLabel l;
    public AddSub()
    {
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);

        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(3);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        if(ae.getSource()==b1)
        {
            int value1  = num1+num2;
            l.setText(value1+"");
        }
        else
        {
            int value2 = num1-num2;
            l.setText(value2+"");
        }
    }
}
    
