package com.BankApp.BankTest;

import java.util.Scanner;

import com.BankApp.BankDto.Customer;

public class App {
	public static void options(Customer c) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		while(true) {
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Transfer Amount");
			System.out.println("4.Passbook");
			System.out.println("5.Update Account");
			System.out.println("6.Reset PIN");
			System.out.println("7.Logout");
			choice = sc.nextInt();
			 
			switch(choice) {
			
			case 1: System.out.println("HI "+ c.getName() + " Your Balance is RS:" + c.getBalance());
				//CheckBalance.balance(c);
					break;
			
			case 2: Deposite.addAmount(c);
					break;
					
			case 3: Transactions.transfer(c);
					 break;
					 
			case 4: getpassbook.passbook(c.getAccno());
					break;
			
			case 5: System.out.println("Update Bank Details");
					BankDetailsUpdate.options(c);
					break;
			
			
			case 6: UpdatePin.resetpin(c);
					 break;	
			
			case 7: System.out.println("Previous Menu");
					//System.out.println("Thank You for Using Khimada bank");
					banktest b= new banktest();
					b.main(null);
					System.exit(0);
					break;
					
			
					
			default : System.out.println("Invalid Input");
					  break;
					  
			}
			
		}
	}
}
