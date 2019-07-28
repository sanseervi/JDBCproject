package com.Sample;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class SelectQuery 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
	try{
			Driver ref=new Driver();
			DriverManager.registerDriver(ref);
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
			st= con.createStatement();
			rs=st.executeQuery("select * from SIGNUP");

			while(rs.next())
			{
				System.out.printf("%-5s", rs.getString(1)+":");
				System.out.printf("%-20s", rs.getString(2));
				System.out.printf("%-25s", rs.getString(3));
				System.out.printf("%-15s", rs.getString(4));
				System.out.printf("%-20s", rs.getString(5));
				System.out.println();
		    }
		}	
		catch (SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				if(con!=null)
				{
					con.close();
				}
				if(st!=null)
				{
					st.close();
				}
				if(rs!=null)
				{
					rs.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}