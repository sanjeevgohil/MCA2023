//swing example of componenet
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
 
class TextfieldDemo extends JFrame implements ActionListener
{
    JLabel lblfnm,lbllnm,lblemail,lblcno,lblmsg;
    JTextField txtfnm,txtlnm,txtemail,txtcno;
    JButton btnsubmit;

    TextfieldDemo(String nm){
        super(nm);
        setVisible(true);
        setSize(600,600);
        setLayout(null);
        lblfnm = new JLabel("First Name:");
        txtfnm = new JTextField();
        lbllnm = new JLabel("Last Name:");
        txtlnm = new JTextField();
        lblemail = new JLabel("Email");
        txtemail = new JTextField();
        lblcno = new JLabel("Contact No");
        txtcno = new JTextField();
        lblmsg = new JLabel("");
        btnsubmit = new JButton("Submit");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblfnm.setBounds(100,30,300,30);
        lbllnm.setBounds(100,60,300,30);
        lblemail.setBounds(100,90,300,30);
        lblcno.setBounds(100,120,300,30);
        lblmsg.setBounds(100,180,300,30);
        txtfnm.setBounds(200,30,200,30);
        txtlnm.setBounds(200,60,200,30);
        txtemail.setBounds(200,90,200,30);
        txtcno.setBounds(200,120,200,30);

        btnsubmit.setBounds(200,150,100,30);
        btnsubmit.addActionListener(this);

        add(lblfnm);
        add(lbllnm);
        add(lblemail);
        add(lblcno);
        add(lblmsg);
        add(txtfnm);
        add(txtlnm);
        add(txtemail);
        add(txtcno);
        add(btnsubmit); 

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        try
		{
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca23","root",""); //MYSQL

    		Statement st = cn.createStatement();
			st.execute("insert into stud1(fnm,lnm,email,cno) values('"+txtfnm.getText().toString()+"','"+txtlnm.getText().toString()+"','"+txtemail.getText().toString()+"','"+txtcno.getText().toString()+"')");
            st.execute("select * from stud1");
			ResultSet rs = st.getResultSet();
			
            lblmsg.setText("Record Inserted");

            txtfnm.setText("");
            txtlnm.setText("");
            txtemail.setText("");
            txtcno.setText("");
            txtfnm.requestFocus();

            while(rs.next())
			{
				System.out.println(" ID : "+rs.getInt(1));
				System.out.println(" First Name : "+rs.getString(2));
				System.out.println(" Last Name : "+rs.getString(3));
                System.out.println(" Email : "+rs.getString(4));
                System.out.println(" Contact No : "+rs.getString(5));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
			lblmsg.setText(ex.toString());
		}
    }
} 
class J91
{
    public static void main(String args[])
    {
        TextfieldDemo tfd = new TextfieldDemo("Swing Text Field");
        
    }
}