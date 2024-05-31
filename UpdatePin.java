package com.BankApp.BankTest;

import java.util.Scanner;

import com.BankApp.BankDao.CustomerDao;
import com.BankApp.BankDto.Customer;

public class UpdatePin {
	
	public static void resetpin(Customer c) {
		Customer C1=null;
		Scanner sc = new Scanner(System.in);
		CustomerDao cdao = new CustomerDao();
		System.out.println("Enter New Pin");
		int pin = sc.nextInt();
		System.out.println("Confirm Pin");
		int cpin = sc.nextInt();
		C1=cdao.getCustomer(c.getAccno());
		boolean res=false;
		
		if(cpin==pin) {
			C1.setPin(pin);
			res=cdao.updateCustomer(C1);
			
			System.out.println("Pin Changed Successfully");
		}
		else {
			System.out.println("Pin MisMatch");
		}
	
		
		
		
	}

}
