class Flipkart
{
	void payment()
	{
		System.out.println("logics to accept payment by cash");	
	}
	void payment(int debitcard)
	{
		System.out.println("logics to accept payment by debitcard");
	}
	void payment(String Upi)
	{					
		System.out.println("logics to accept payment by Upi");
	}
}
class Example4
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Flipkart cust1 = new Flipkart();
		cust1.payment(10000);
		System.out.println("Stop @ Cyber Success");
	}
}