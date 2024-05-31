package com.BankApp.BankTest;

import java.util.Scanner;

import com.BankApp.BankDao.CustomerDao;
import com.BankApp.BankDto.Customer;

public class Deposite {

	public static void addAmount(Customer c) {
		Scanner sc = new Scanner(System.in);
		CustomerDao cdao = new CustomerDao();
		Customer c1=null;
		boolean res=false;
		System.out.println("Enter Amount to be Deposite");
		double deposite=sc.nextDouble();
		c1=cdao.getCustomer(c.getAccno());
		
		
		double total=c1.getBalance() + deposite;
		c.setBalance(total);
		res=cdao.updateCustomer(c);
		if(res) {
			System.out.println("Amount Deposited Successfully");
			insertintopassbook.insert(c,deposite,total);
		}
		else {
			System.out.println("Amount NOT Deposited");
		}
		
		
	}

	
	
}
