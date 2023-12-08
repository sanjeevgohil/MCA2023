//prepared statement
import java.sql.*;
class J99
{
    public static void main(String args[])
    {
        Connection cn;
        PreparedStatement st;
        ResultSet rs;
        try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca23","root","");

    		st = cn.prepareStatement("update stud1 set fnm='Ram',lnm='Raj' where id = ?");
			st.setInt(1,11);
			int a = st.executeUpdate();
			
			System.out.println("Record Update.....");
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
    }
}