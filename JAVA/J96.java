//swing example of menudemo
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
 
class JMenuDemo extends JFrame
{
    JMenuDemo(String nm){
        super(nm);
        setVisible(true);
        setSize(600,600);
        setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Program Start
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu addstud = new JMenu("Add Student");
		JMenu dispstud = new JMenu("Show Student");
		JMenu exit = new JMenu("Exit");
		mb.add(addstud);
		mb.add(dispstud);
		mb.add(exit);
    }
} 
class J96
{
    public static void main(String args[])
    {
        JMenuDemo jmd = new JMenuDemo("Student Management System");
        
    }
}