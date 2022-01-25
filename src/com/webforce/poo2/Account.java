package com.webforce.poo2;

import java.util.Random;

public class Account {
	
	Bank bank;
	Customer customer;
	
	
	public Account( Bank bank, Customer customer) {
		super();
	
		this.bank = bank;
		this.customer = customer;
	}
	/*
	public String getIban() {
		
		Random r = new Random();
		int low = 7812;
		int high = 7896;
		int result = r.nextInt(high-low) + low;
		return bank.getCountryIdentifier()+bank.getBankIdentifier()+result;
	}
	*/
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
