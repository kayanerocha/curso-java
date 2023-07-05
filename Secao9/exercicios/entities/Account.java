package entities;

public class Account {
	
	private int accountNumber;
	private String holder;
	private double balance;
	private static final double TAX = 5.00;
	
	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}

	public Account(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value + TAX;
	}
	
	@Override
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	
	
	
	
	

}
