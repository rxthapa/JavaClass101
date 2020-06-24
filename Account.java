package com.JavaClass101;

public class Account {
	private double balance;
	private long accountNo;
	private String type;
	private String status;

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
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
		} else if ((balance - amount) > -100) {
			balance = balance - (amount + 50);
			return true;
		} else {
			return false;
		}
	}

	public double deposite(double amount) {
		balance = balance + amount;
		return balance;
	}
}
