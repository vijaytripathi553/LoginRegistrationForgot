package com.gtl.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider implements MyProvider {

	public static Connection con=null;
	public static Connection getCon()
	{
		try
		{
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("forName called");
			System.out.println("Username:"+userName+"Password"+password);
			// Establishing the connection
			con=DriverManager.getConnection(connectionUrl,userName,password);
			System.out.println("Server connected...");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	public static void main(String args[])
	{
		MyConnectionProvider.getCon();
	

}
}