//swing example of JDBC connectivity insert record
import java.sql.*;
class J94
{
    public static void main(String args[])
    {
        try
		{
			 Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca23","root",""); //MYSQL

    		Statement st = cn.createStatement();
			st.execute("insert into stud(fnm,lnm,email,cno) values('SANJEEv','GOHIL','sanjeev@gmail.com','9865785412')");
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
			System.out.println("Record Inserted...");
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
    }
}