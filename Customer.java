package com.BankApp.BankDto;

public class Customer {
	private int accno;
	private String name;
	private long Phone;
	private String mail;
	private double balance;
	private int pin;
	
	
	
	public Customer(int accno, String name, long phone, String mail, double balance, int pin) {
		
		this.accno = accno;
		this.name = name;
		Phone = phone;
		this.mail = mail;
		this.balance = balance;
		this.pin = pin;
	}
	
	
	public Customer() {
		super();
	}


	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}


	@Override
	public String toString() {
		return "Customer [accno=" + accno + ", name=" + name + ", Phone=" + Phone + ", mail=" + mail + ", balance="
				+ balance + ", pin=" + pin + "]";
	}
	
	
	
}
