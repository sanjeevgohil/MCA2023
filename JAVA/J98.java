//prepared statement
import java.sql.*;
class J98
{
    public static void main(String args[])
    {
        Connection cn;
        PreparedStatement st;
        ResultSet rs;
        try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca23","root","");

    		st = cn.prepareStatement("insert into stud1(fnm,lnm,email,cno) values(?,?,?,?)");
			st.setString(1,"Raj");
			st.setString(2,"Rathod");
			st.setString(3,"Raj@gmail.com");
			st.setString(4,"7896541236");
			int a = st.executeUpdate();
			
			System.out.println("Record Inserted.....");
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
    }
}