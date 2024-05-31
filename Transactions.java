package com.BankApp.BankTest;

import java.util.Scanner;

import com.BankApp.BankDao.CustomerDao;
import com.BankApp.BankDto.Customer;

public class Transactions {
	public static void transfer(Customer c1) {
		 Scanner sc = new Scanner(System.in);
		 CustomerDao cdao = new CustomerDao();
		 
		 System.out.println("Enter your Benificiary account Number");
		 int benificiary_acc_no = sc.nextInt();
		 
		 System.out.println("Enter the amount to be transferred");
		 double amount = sc.nextDouble();
		 
		 System.out.println("Enter the pin");
		 int pin = sc.nextInt();
		 
		 c1=cdao.getCustomer(c1.getAccno(), pin);
		 Customer c2 = cdao.getCustomer(benificiary_acc_no);
		 if(c1.getAccno()!=benificiary_acc_no && amount<=c1.getBalance() && c1.getBalance() != 0 && amount>0) {
			 
			 double bal1 = c1.getBalance()-amount;
			 c1.setBalance(bal1);
			 System.out.println("Amount Debited");
			 double bal2 = c2.getBalance()+amount;
			 
			 c2.setBalance(bal2);
			 if(bal2==c2.getBalance()) {
				 
				 System.out.println(c2);
				 boolean rs1= cdao.updateCustomer(c1);
				 if(rs1) {
					 boolean rs2 = cdao.updateCustomer(c2);
					 if(rs2) {
						 System.out.println("The amount of RS."+ amount + "is successfully transferred to "+c2.getName());
						 System.out.println("Your updated balance is Rs."+c1.getBalance());
						 insertintopassbook.insert(c1.getAccno(), c2.getAccno(), amount , bal1);
						 insertintopassbook.insert(c2.getAccno(),amount,c1.getAccno() , bal2);
					 }
					 else {
						 System.out.println("Failed to transfer");
					 }
				 }
				 
			 }
			 else {
				 System.out.println("Failed to transfer");
			 }
		 }
	
	}
}
