package com.bank;

public class Account {

	private long balance;
	private long accountNo;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(long amount) {
		//what is your balance??  100
		
		if (amount > 0) {
			balance = amount+balance;
		}
		
		//what is ur balance now 0
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public boolean withdraw(long amount) {
		if (balance >= amount) {
			balance = balance - amount;
			return true;
		} else {
			return false;
		}

	}
}
