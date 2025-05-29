class HDFC
{
	private int balance;
	HDFC(int balance)
	{
		this.balance = balance;
	}
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int depostamount)
	{
		if(depostamount > 0)
		{
			balance = balance + depostamount;
			System.out.println("Deposite amount is successfull");
		}
		else
		{
			System.out.println("Please enter valid amount");
		}
	}
}
class Example1
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		HDFC cust1 = new HDFC(10000);
		int currentBal = cust1.getBalance();
		System.out.println("The Current balance is "+currentBal);
		cust1.setBalance(5000);
		currentBal = cust1.getBalance();
		System.out.println("The Current balance is "+currentBal);
		System.out.println("Stop @ Cyber Success");
	}
}