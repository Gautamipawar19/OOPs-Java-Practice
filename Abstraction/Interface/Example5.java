interface IciciBankAcc
{
	void bankAcc();
}
interface IciciBankLoans
{
	void bankLoans();
}
class CustomerIdProof
{
	void Adhaar()
	{
		System.out.println("Logics for Adhaar / Address.....");
	}
}
class Customer extends CustomerIdProof implements IciciBankAcc,IciciBankLoans
{
	public void bankAcc()
	{
		System.out.println("Open Saving Bank Account");
	}
	public void bankLoans()
	{
		System.out.println("Apply for personal Loans");
	}
}
class Example5
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Customer ref = new Customer();
		ref.Adhaar();
		ref.bankAcc();
		ref.bankLoans();
		System.out.println("Stop @ Cyber Success");
	}
}