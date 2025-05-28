interface AmexBankAcc
{
	void bankAccount();
}
interface AmexBankLoans
{
	void bankloans();
}
interface AmexFreeInsurance extends AmexBankAcc,AmexBankLoans
{
	void freeInsurance();
}
class Customer3 implements AmexFreeInsurance
{
	public void bankAccount()
	{
		System.out.println("inside Bank Account Implementation");
	}
	public void bankloans()
	{
		System.out.println("Inside Bank loans Implementation");
	}
	public void freeInsurance()
	{
		System.out.println("Inside Free Insurance Implementation");
	}
}
class Example4
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Customer3 ref =new Customer3();
		ref.bankAccount();
		ref.bankloans();
		ref.freeInsurance();
		System.out.println("Stop @ Cyber Success");
	}
}