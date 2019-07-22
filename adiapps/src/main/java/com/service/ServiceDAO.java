package com.service;

public interface ServiceDAO {
	public void createAccountForCustomer(String accountNo);
	public void deposit(String accountNo,int balance);
	public int getBalance(String accountNo);
}
