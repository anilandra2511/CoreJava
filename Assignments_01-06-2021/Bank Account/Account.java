package aa;

public class Account
{
	Customer customer;
	double balance;
	int accountNo;
	float interestRate;
	
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	public Customer getCustomer() 
	{
		return customer;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void setAccountNo(int accountNo)
	{
		this.accountNo = accountNo;
	}
	public int getAccountNo()
	{
		return accountNo;
	}
	
	public void setInterestRate(float interestRate) 
	{
		this.interestRate = interestRate;
	}
	public float getInterestRate()
	{
		return interestRate;
	}
	
	public Account()
	{
		System.out.println("Default Constructor");
		this.customer = null;
		this.balance = 100;
		this.accountNo = 0;
		this.interestRate = 0;
	}
	
	public Account(Customer customer,int accountNo, double balance,  float interestRate) 
	{
		System.out.println("Parameterized Constructor");
		this.customer = customer;
		this.balance = balance;
		this.accountNo = accountNo;
		this.interestRate = interestRate;
	}
	
	public void deposit(double amount)
	{
		double x = amount;
		balance += x;
		System.out.println(amount +" is Successfully Deposited");
	}
	
	public void withdraw(double amount)
	{
		if(amount < balance)
		{
			balance -= amount;
			System.out.println(amount +" is Withdrawn");
		}
		else
			System.out.println("No sufficient balance");
	}
	
	public double balEnquiry()
	{
		return balance;
	}

}
