//swing example of JDBC connectivity crud record
import java.sql.*;
class J95
{
    public static void main(String args[])
    {
        try
		{
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca23","root",""); //MYSQL
    		Statement st = cn.createStatement();
			
			st.execute("insert into stud(fnm,lnm,email,cno) values('Harsh','Shah','harsh@gmail.com','9854785412')");
			st.execute("update stud set cno='1234567890' where id=5");
			st.execute("delete from stud where id=1");
			st.execute("select * from stud");

			ResultSet rs = st.getResultSet();

			while(rs.next())
			{
				System.out.println(" ID : "+rs.getInt(1));
				System.out.println(" First Name : "+rs.getString(2));
				System.out.println(" Last Name : "+rs.getString(3));
                System.out.println(" Email : "+rs.getString(4));
                System.out.println(" Contact No : "+rs.getString(5));
				System.out.println();
			}
			System.out.println("Operation Done Sucessfully...");
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
    }
}