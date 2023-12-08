//prepared statement
import java.sql.*;
class J100
{
    public static void main(String args[])
    {
        Connection cn;
        PreparedStatement st;
        ResultSet rs;
        try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca23","root","");

    		st = cn.prepareStatement("delete from stud1 where id = ?");
			st.setInt(1,11);
			int a = st.executeUpdate();
			
			System.out.println("Record Delete.....");
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
    }
}