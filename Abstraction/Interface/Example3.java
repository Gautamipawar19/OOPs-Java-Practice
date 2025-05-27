interface HsbcBankAccount
{
	void bankAccount();
} 
interface HsbcLoans extends HsbcBankAccount
{
	void loans();
} 
class Customer1 implements HsbcBankAccount
{							   
	public void bankAccount()
	{
		System.out.println("Open Saving Account");
	}
}
class Customer2 implements HsbcLoans
{
	public void bankAccount()
	{
		System.out.println("Open Current Account");
	}
	public void loans()
	{
		System.out.println("Apply for personal loans");
	}
}
class Example3 
{
	public static void main(String args[])
	{
		Customer1 cust1 = new Customer1();
		cust1.bankAccount();
		System.out.println("_ _ _ _ _ _ _ _  _ _ _ _ _ ");
		Customer2 cust2 = new Customer2();
		cust2.bankAccount();
		cust2.loans();
	}
}