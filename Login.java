package com.BankApp.BankTest;

import java.util.Scanner;

import com.BankApp.BankDao.CustomerDao;
import com.BankApp.BankDto.Customer;

public class Login {
	public static void CustomerLogin() {
		Scanner sc = new Scanner(System.in);
		CustomerDao cdao = new CustomerDao();
		
		
		System.out.println("Enter the Accno");
		int accno = sc.nextInt();
		System.out.println("Enter Pin Number");
		int pin = sc.nextInt();
		
		Customer c = new Customer();
		c.setAccno(accno);
		c.setPhone(pin);
		
		c=cdao.getCustomer(accno, pin);
		if(c!=null) {
			System.out.println("Login Successfully Done");
			App.options(c);
			System.out.println(c);
		}
		else {
			System.out.println("Login Failed");
		}
	}
}
