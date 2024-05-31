package com.BankApp.BankTest;

import java.util.Scanner;

public class banktest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------------------------");
		System.out.println("----------------Welcome To Khimada Bank--------------");
		while(true) {
			System.out.println("1.Login IN");
			System.out.println("2.Sign Up or Creat a Bank Account");
			System.out.println("3.Exit");
			
			int ch=0;
			ch=sc.nextInt();
			
			switch(ch) {
			case 1: Login.CustomerLogin();    
					break;
					
			case 2: SignUp.CustomerSignUP();
					break;
					
			case 3: System.out.println("Thank You for Using Khimada Bank");
			        System.exit(0);
			        break;
			        
			 default: System.out.println("Invalid Choice");
			 		 break;
			 		 
					
					
			} //switch
		}	
	} //main
	
	
	
}
