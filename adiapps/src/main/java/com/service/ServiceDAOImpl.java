package com.service;

import com.model.Account;
import com.model.AccountDAOImpl;

public class ServiceDAOImpl implements ServiceDAO{
	private AccountDAOImpl accountDAOImpl;
public void createAccountForCustomer(String accountNo) {
	   accountDAOImpl.createAccount(new Account(accountNo,0));
}
/*public void removeAccount(String accountNo)
{
	Account account=accountDAOImpl.findAccount(accountNo);
	accountDao.removeAccount(account);
}*/

public ServiceDAOImpl(AccountDAOImpl accountDAOImpl) {
	
	this.accountDAOImpl = accountDAOImpl;
}

public int getBalance(String accountNo) {
	// TODO Auto-generated method stub
	return accountDAOImpl.findAccount(accountNo).getBalance();
}
public void deposit(String accountNo, int amount) {
	// TODO Auto-generated method stub
	Account account=accountDAOImpl.findAccount(accountNo);
	account.setBalance(account.getBalance()+amount);
	accountDAOImpl.updateAccount(account);
}
}
