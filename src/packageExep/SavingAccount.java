package packageExep;

public class SavingAccount {
	private String name;
	private int age;
	private double balance;
	
	public SavingAccount(String name,int age,double balance) 
	{
		super();
		this.name=name;
		this.age=age;
		this.balance=balance;
	}
	
	public void createNewAccount() throws AgeException
	{
	if(age>18) 
	{
	System.out.println("Request Registered for "+name+" Successfully");	
	}	
	else 
	{
		throw new AgeException();
	}
	
	}
	
	public static void main(String[]args) {
		SavingAccount a1=new SavingAccount("Ram",21,12000.00);
		SavingAccount a2=new SavingAccount("Shyam",17,12000.00);
		
		try {
			a1.createNewAccount();
			a2.createNewAccount();
		}
		catch(AgeException e){}
	}
}
