import java.util.ArrayList;
import java.util.List;

class Account{
	private String accountNumber;
	private String accountHolder;
	private double balance;
	private List<String> transactionHistory;
	
	public Account(String accountNumber, String accountHolder, double initialBalance)
	{
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = initialBalance;
		
		this.transactionHistory = new ArrayList<>();
		transactionHistory.add("Account has been created with " + initialBalance);
	}
	
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance += amount;
			transactionHistory.add("Deposit amount : " + amount);
			System.out.println("Money has been deposited successfully to " + accountNumber);
		}
		else {
			System.out.println("Invalid Deposit amount");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount > 0 && amount <= balance)
		{
			balance -= amount;
			transactionHistory.add("Withdraw amount : " + amount);
			System.out.println("Money has been withdrawn successfully to " + accountNumber);
		}
		else {
			System.out.println("Insufficient funds or balance");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public void printTransactionalHistory()
	{
		System.out.println("Transactional history for " + accountHolder + " :");
		for(String transaction : transactionHistory)
		{
			System.out.println(transaction);
		}
	}
}


public class BankAccountSimulation {

	
		public static void main(String[] args)
		{
			Account accNum1 = new Account("1234856ABC", "Arumugam Pandaram", 10000);
			
			accNum1.deposit(5000);
			accNum1.withdraw(2000);
			accNum1.getAccountNumber();
			accNum1.getBalance();
			
			System.out.println("Current Balance in account " + accNum1.getAccountNumber() + " is " + accNum1.getBalance());
			
			accNum1.printTransactionalHistory();
		}
	
}
