package com.BankApp.BankTest;

import java.util.Scanner;

import com.BankApp.BankDao.CustomerDao;
import com.BankApp.BankDto.Customer;

public class SignUp {
	public static void CustomerSignUP() {
		Scanner sc = new Scanner(System.in);
		CustomerDao cdao = new CustomerDao();
		
		System.out.println("Enter the details of Customer");
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter Phone Number");
		long phone = sc.nextLong();
		System.out.println("Enter your mail id");
		String mail = sc.next();
		System.out.println("Set Pin");
		int pin = sc.nextInt();
		
		System.out.println("Confirm Pin");
		int cpin = sc.nextInt();
		if(pin==cpin) {
			Customer c = new Customer();
			c.setName(name);
			c.setPhone(phone);
			c.setMail(mail);
			c.setPin(cpin);
			boolean res =cdao.insertCustomer(c);
			if(res==true) {
				c=cdao.getCustomer(phone);
				System.out.println("Bank Account Created Succesfully for: " + c.getAccno());
			}
		}
		else {
			System.out.println("Password MisMatched");
		}
		
	}
}
