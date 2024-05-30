package com.BankApp.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	public static Connection requestConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/Bank";
		String user = "root";
		String pass = "tiger";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url, user, pass);
		
		return con;
	}
}
