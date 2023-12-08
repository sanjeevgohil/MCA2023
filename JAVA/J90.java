//swing example JTextfield,JButton,JLabel
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class TextfieldDemo extends JFrame implements ActionListener
{
    JLabel label1,label2,label3,label4;
    JTextField text1,text2;
    JButton button1;

    TextfieldDemo(String nm){
        super(nm);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        label1 = new JLabel("First Name:",JLabel.LEFT);
        container.add(label1);
        text1 = new JTextField("",15);
        container.add(text1);
        label2 = new JLabel("Last Name:",JLabel.LEFT);
        container.add(label2);
        text2 = new JTextField("",15);
        container.add(text2);
        button1 = new JButton("Submit");
        container.add(button1);

        label3 = new JLabel("",JLabel.LEFT);
        container.add(label3);
        label4 = new JLabel("",JLabel.LEFT);
        container.add(label4);

        button1.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        label3.setText(text1.getText().toString());
        label4.setText(text2.getText().toString());
    }
} 
class J90
{
    public static void main(String args[])
    {
        TextfieldDemo tfd = new TextfieldDemo("Swing Text Field");
        tfd.setVisible(true);
        tfd.setSize(250,350);
    }
}