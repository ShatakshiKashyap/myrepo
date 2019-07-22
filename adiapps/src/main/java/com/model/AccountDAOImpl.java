package com.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AccountDAOImpl implements IAccountDao {
	private Map<String, Account> accounts;

	public AccountDAOImpl() {
		// TODO Auto-generated method stub
		accounts = Collections.synchronizedMap(new HashMap<String, Account>());
	}

	public boolean accountExists(String accountNo) {
		// TODO Auto-generated method stub
		return accounts.containsKey(accountNo);
	}

	

	public void updateAccount(Account account) {
		// TODO Auto-generated method stub
		if (!accountExists(account.getAcc_num())) {
			throw new RuntimeException();
		}
		accounts.put(account.getAcc_num(), account);
	}

	public void createAccount(Account account) {
		// TODO Auto-generated method stub
		
			if (accountExists(account.getAcc_num())) {
				throw new RuntimeException();
			}
			accounts.put(account.getAcc_num(), account);
		}

	public Account findAccount(String accountNo) {
		// TODO Auto-generated method stub
		Account account = accounts.get(accountNo);
		if (account == null) {
			throw new RuntimeException();
		}
		return account;
	
	}
		
	

	

}
