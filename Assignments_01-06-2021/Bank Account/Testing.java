package aa;

public class Testing
{
	public static void main(String[] args) 
	{
		Customer c = new Customer("Anil" , "Andra");
		Account acc =new Account(c,20001431,50000,10);
		acc.setInterestRate(15);
		System.out.println(acc.getAccountNo());
		System.out.println(acc.getBalance());
		acc.deposit(20000);
		acc.withdraw(3000);
		System.out.println(acc.getBalance());
	}

}
