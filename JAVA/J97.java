//prepared statement
import java.sql.*;
class J97
{
    public static void main(String args[])
    {
        Connection cn;
        PreparedStatement st;
        ResultSet rs;
        try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca23","root","");

    		st = cn.prepareStatement("select * from stud1 where id = ?");
            st.setInt(1,4);
			rs = st.executeQuery();
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