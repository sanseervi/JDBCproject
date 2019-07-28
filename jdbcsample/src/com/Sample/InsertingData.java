package com.Sample;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class InsertingData {

	public static void main(String[] args) throws Exception
	{
		try{
			Driver ref=new Driver();
			DriverManager.registerDriver(ref);
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
			Statement stmt = con.createStatement();
			int update = stmt.executeUpdate("INSERT INTO SIGNUP(FullName,Username,Contactno,Place) VALUES('xyz','xyz12',9922222204,'Bxxxore')");	
		}	
		catch (SQLException e){
			e.printStackTrace();
		}
	}
}