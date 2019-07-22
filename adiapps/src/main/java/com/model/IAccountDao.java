package com.model;

public interface IAccountDao {
public void createAccount(Account account);
public boolean accountExists(String accountNo);
public void updateAccount(Account account);
public Account findAccount(String accountNo);
}
