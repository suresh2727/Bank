package com.BankApp.BankTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.BankApp.BankDto.Customer;
import com.BankApp.connector.Connector;

public class insertintopassbook {
	//while depositing 
	public static boolean insert(Customer c, double deposite, double total) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String query = "insert into passbook (accno,credit,NewBalance) values(?,?,?)";
		int res=0;
		
		try {
			con=Connector.requestConnection();
			ps=con.prepareStatement(query);
			ps.setInt(1, c.getAccno());
			ps.setDouble(2, deposite);
			ps.setDouble(3, total);
			res =ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(res>0) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	
	// while transcition using 1st value From acc to benificary
	public static boolean insert(int accno, int accno2, double amount, double bal1) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		//String query = "INSERT INTO PASSBOOK(from,credit,NewBalance) VALUES(?,?,?)";
		String query = "insert into passbook (accno,toaccno,debit,NewBalance) values(?,?,?,?)";
		int res=0;
		
		try {
			con=Connector.requestConnection();
			ps=con.prepareStatement(query);
			ps.setInt(1, accno);
			ps.setInt(2, accno2);
			ps.setDouble(3, amount);
			ps.setDouble(4, bal1);
			res =ps.executeUpdate();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(res>0) {
			return true;
			
		}
		else {
			return false;
		}
		
	}
	// while adding from beneficary to accno 
	public static boolean insert(int accno, double amount, int accno2, double bal2) {
		Connection con = null;
		PreparedStatement ps = null;
		String query = "insert into passbook (toaccno,accno,credit,NewBalance) values(?,?,?,?)";
		int res=0;
		
		try {
			con=Connector.requestConnection();
			ps=con.prepareStatement(query);
			ps.setInt(1, accno2);
			ps.setInt(2, accno);
			ps.setDouble(3, amount);
			ps.setDouble(4, bal2);
			res =ps.executeUpdate();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(res>0) {
			return true;
			
		}
		else {
			return false;
		}
		
	}
}
