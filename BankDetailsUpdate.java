package com.BankApp.BankTest;

import java.util.Scanner;

import com.BankApp.BankDao.CustomerDao;
import com.BankApp.BankDto.Customer;

public class BankDetailsUpdate {
	public static void options(Customer c) {
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		while(true) {
			System.out.println("1.Update Name");
			System.out.println("2.Update Phone");
			System.out.println("3.Update Mail");
			System.out.println("4.Update Balance");
			System.out.println("5.Exit");
			choice = sc.nextInt();
			CustomerDao cdao = new CustomerDao();
			Customer c1 = null;
			boolean res;
			switch(choice) {
			
			case 1: System.out.println("Enter the name to be Update");
			        String name = sc.next();
			        c1= cdao.getCustomer(c.getAccno());
					c1.setName(name);
					res = cdao.updateCustomer(c1);
					if(res) {
						System.out.println("Name Changed Successfully");
					}
					else {
						System.out.println("Name Not Changed");
					}
				    break;
			        
					
			
		 case 2: System.out.println("Enter the Phone Number to be Updated");
		 			long phone = sc.nextLong();
		 			c1= cdao.getCustomer(c.getAccno());
		 			c1.setPhone(phone);
		 			res = cdao.updateCustomer(c1);
		 			if(res) {
		 				System.out.println("Phone Number Changed Successfully");
		 			}
		 			else {
		 				System.out.println("Phone Number Not Changed");
		 			}
					break;
					
		case 3: 	System.out.println("Enter the Mail Id to be Updated");
					String mail = sc.next();
					c1= cdao.getCustomer(c.getAccno());
					c1.setMail(mail);
					res = cdao.updateCustomer(c1);
					if(res) {
						System.out.println("Mail Changed Successfully");
					}
					else {
					System.out.println("Mail Not Changed");
					}
					break;
			
			case 4: System.out.println("Enter the Balance to be Updated");
					double bal = sc.nextDouble();
					c1= cdao.getCustomer(c.getAccno());
					c1.setBalance(bal);
					res = cdao.updateCustomer(c1);
					if(res) {
						System.out.println("Balanced Updated Successfully");
					}
					else {
						System.out.println("Balanced Not updated");
					}
					break;
					
			
			
			case 5: System.out.println("Exit");
					 App.options(c);
					 break;	
					
			default : System.out.println("Invalid Input");
					  break;
					  
			}
		
	}
	
		
}
}

