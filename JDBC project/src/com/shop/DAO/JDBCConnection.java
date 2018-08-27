package com.shop.DAO;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
public class JDBCConnection {

	final String JDBCDRIVER = "com.mysql.jdbc.Driver";
	final String JDBCURL = "jdbc:mysql://localhost:3306/shop";
	final String DBUSER = "root";
	final String DBPASS = "ankit";
	
	Connection makeConnection() throws SQLException , ClassNotFoundException
	{
		Connection connection = null;
		try
		{
			Class.forName(JDBCDRIVER);
			connection = DriverManager.getConnection(JDBCURL,DBUSER, DBPASS);
		}//end of try
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(connection);
		return connection;
	}//end of makeConnection
	
	
}//end of class

