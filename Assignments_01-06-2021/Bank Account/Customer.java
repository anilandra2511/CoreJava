package aa;

public class Customer 
{
	private String firstName , lastName;

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public Customer()
	{
		this.firstName = null;
		this.lastName = null;
	}
	
	public Customer(String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
