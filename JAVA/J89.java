//swing example JLabel
import javax.swing.*;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;

class WindowExit extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
class J89
{
    public static void main(String args[])
    {
        JFrame f1 = new JFrame();
        WindowExit we = new WindowExit();
        f1.addWindowListener(we);
        f1.setSize(600,600);
        f1.setTitle("First Example");
        f1.setVisible(true);
        f1.setLocation(100, 100);

        Container c1 = f1.getContentPane();
        c1.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel j1 = new JLabel("Welcome To MCA",JLabel.LEFT);
        c1.add(j1);
        JLabel j2 = new JLabel("Welcome To Ruparel",JLabel.RIGHT);
        c1.add(j2);

    }
}