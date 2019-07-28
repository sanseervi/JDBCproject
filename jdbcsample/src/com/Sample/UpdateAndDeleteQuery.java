package com.Sample;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class UpdateAndDeleteQuery
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement st=null;
		Object rs=null;
	try{
			Driver ref=new Driver();
			DriverManager.registerDriver(ref);
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
			st= con.createStatement();
			/*rs=st.executeUpdate("delete from signup where id=1;");*/ //to delete the record
			rs=st.executeUpdate("update signup set Place='Tirupur TN' where id=2;"); //to update the record

			}	
		catch (SQLException e){
			e.printStackTrace();
		}
	}
}