package com.BankApp.BankTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.BankApp.BankDto.Customer;
import com.BankApp.connector.Connector;

public class getpassbook {
	public static void passbook(int accno) {
		//Customer c=null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		
		String query = "select * from passbook where accno=?";
		boolean res=false;
		
		try {
			con=Connector.requestConnection();
			ps=con.prepareStatement(query);
			ps.setInt(1,accno);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("-------------------------------");
				System.out.println("From: " +rs.getInt(1));
				System.out.println("To: " + rs.getInt(2));
				System.out.println("Credit:+" + rs.getDouble(3));
				System.out.println("Debit:-" + rs.getDouble(4));
				System.out.println("NewBalance: " + rs.getDouble(5));
				System.out.println("-------------------------------");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
}
