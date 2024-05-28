package com.BankApp.BankDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.print.attribute.SetOfIntegerSyntax;

import com.BankApp.BankDto.Customer;
import com.BankApp.connector.Connector;

public class CustomerDao {
	
	//-----------------------Insert data---------------------------------
	public static boolean insertCustomer(Customer c) {
		Connection con = null;
		PreparedStatement ps = null;
		String query = "INSERT INTO CUSTOMER(name,phone,mail,pin) VALUES(?,?,?,?)";
		int res=0;
		
		try {
			con=Connector.requestConnection();
			ps=con.prepareStatement(query);
			ps.setString(1, c.getName());
			ps.setLong(2, c.getPhone());
			ps.setString(3, c.getMail());
			ps.setInt(4, c.getPin());
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
	
	
	//---------------------------Get Customer With Phone Number-----------------------------------
	public static Customer getCustomer(long phone) {
		Customer c=null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		
		String query = "select * from customer where phone=?";
		boolean res=false;
		
		try {
			con=Connector.requestConnection();
			ps=con.prepareStatement(query);
			ps.setLong(1, phone);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				c=new Customer();
				c.setAccno(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setPhone(rs.getLong(3));
				c.setMail(rs.getString(4));
				c.setBalance(rs.getDouble(5));
				c.setPin(rs.getInt(6));
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	
	//------------------------------Get Customer with acco number-------------------- 
	
	public static Customer getCustomer(int accno) {
		Customer c=null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		
		String query = "select * from customer where accno=?";
		boolean res=false;
		
		try {
			con=Connector.requestConnection();
			ps=con.prepareStatement(query);
			ps.setInt(1, accno);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				c=new Customer();
				c.setAccno(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setPhone(rs.getLong(3));
				c.setMail(rs.getString(4));
				c.setBalance(rs.getDouble(5));
				c.setPin(rs.getInt(6));
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}
	
	//----------------------------Details of Customer With accnno and pin
	
	public static Customer getCustomer(int accno, int pin) {
		Customer c=null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		
		String query = "select * from customer where accno=? and pin=?";
		boolean res=false;
		
		try {
			con=Connector.requestConnection();
			ps=con.prepareStatement(query);
			ps.setInt(1, accno);
			ps.setInt(2, pin);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				c=new Customer();
				c.setAccno(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setPhone(rs.getLong(3));
				c.setMail(rs.getString(4));
				c.setBalance(rs.getDouble(5));
				c.setPin(rs.getInt(6));
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}
	
	
	//----------------------------------Delete a Database--------------------------------
	
	public static boolean DeleteCustomer(Customer c) {
		
		
		return false;
		
	}
	
	//-------------------U-p-d-a-t-e---C-u-s-t-o-m-e-r---P-i-n


	public static boolean updateCustomer(Customer c) {
		Connection con = null;
		PreparedStatement ps = null;
		String Query = "UPDATE CUSTOMER SET NAME=?,PHONE=?,MAIL=?,BALANCE=? , PIN=? WHERE ACCNO=?";
		int res=0;
		
		try {
			con=Connector.requestConnection();
			ps=con.prepareStatement(Query);
			ps.setString(1, c.getName());
			ps.setLong(2, c.getPhone());
			ps.setString(3, c.getMail());
			ps.setDouble(4, c.getBalance());
			ps.setInt(5, c.getPin());
			ps.setInt(6, c.getAccno());
			res=ps.executeUpdate();
		}catch(ClassNotFoundException | SQLException e) {
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
