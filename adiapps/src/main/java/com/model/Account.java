package com.model;

public class Account {
	String Acc_num;
	int Balance;
	public Account(String acc_num, int balance) {
		Acc_num = acc_num;
		Balance = balance;
	}
	public String getAcc_num() {
		return Acc_num;
	}
	@Override
	public String toString() {
		return "Account [Acc_num=" + Acc_num + ", Balance=" + Balance + "]";
	}
	public void setAcc_num(String acc_num) {
		Acc_num = acc_num;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}

}
