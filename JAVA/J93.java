//swing example of JDBC connectivity MySQL
import java.sql.*;
class J93
{
    public static void main(String args[])
    {
        try
		{
			 //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			 Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca23","root",""); //MYSQL

    		Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from stud");
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
				ex.printStackTrace();
		}
    }
}