package com.bank;

abstract class BankAccount {
	private int accNum;
	private String accHolder;
	private double accBalance;
	public BankAccount(int accNum, String accHolder, double accBalance) {
		this.accNum = accNum;
		this.accHolder = accHolder;
		this.accBalance = accBalance;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public void showBalance() {
		System.out.println("Balance: "+this.accBalance);
	}
	abstract double withdraw(double amount);
	abstract double deposit(double amount);
	
	


	@Override
	public String toString() {
		return "BankAccount [accNum=" + accNum + ", accHolder=" + accHolder + ", accBalance=" + accBalance + "]";
	}
}
class SavingsAccount extends BankAccount{
	public SavingsAccount(int accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
	}

	public double withdraw(double amount) {
		if(amount>this.getAccBalance() || amount>30000) {
			System.out.println("Withdrawl not possible");
			return getAccBalance();
			
			
		}
		this.setAccBalance(this.getAccBalance()-amount);
		return getAccBalance(); 
		

		
	}
	public double deposit(double amount) {
		if(amount>1000000) {
			System.out.println("Deposit limit exceeded");
			return getAccBalance();
		}
		this.setAccBalance(this.getAccBalance()+amount);
		return getAccBalance(); 
		
		
		
	}

	
}
class SalaryAccount extends BankAccount{
	public SalaryAccount(int accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
	}

	public double withdraw(double amount) {
		if(amount>this.getAccBalance() || amount>100000 ) {
			System.out.println("Withdrawl not possible");
			return getAccBalance(); 
			
		}
		this.setAccBalance(this.getAccBalance()-amount);
		return getAccBalance(); 

			}
	public double deposit(double amount) {
		this.setAccBalance(this.getAccBalance()+amount);
		return getAccBalance(); 

		
	}
	
}
