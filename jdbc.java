import java.sql.*;
public class jdb
{
    public static void main(String[] args)throws ClassNotFoundException ,SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/name","root","");
        Statement s =con.createStatement();
        ResultSet rs=s.executeQuery("select * from name1");
        while(rs.next())
        {
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
    }
    }