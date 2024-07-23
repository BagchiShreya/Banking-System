package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection cn=null;
		String dbUrl="jdbc:mysql://localhost:3306/misc";
		try {
			cn=DriverManager.getConnection(dbUrl,"root","");
			System.out.println("Connection successful");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}



//Driver D=new Driver
//DriverManager.registerDriver()-->pass driver type of db
//forName("ClassName")-->returns class object of the class passed as argument



