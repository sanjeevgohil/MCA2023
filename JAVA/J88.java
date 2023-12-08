//swing example closing event
import javax.swing.*;
import java.awt.event.*;

class WindowExit extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
class J88
{
    public static void main(String args[])
    {
        JFrame f1 = new JFrame();
        WindowExit we = new WindowExit();
        f1.addWindowListener(we);
        f1.setSize(400,400);
        f1.setTitle("First Example");
        f1.setVisible(true);
        f1.setLocation(100, 100);
    }
}