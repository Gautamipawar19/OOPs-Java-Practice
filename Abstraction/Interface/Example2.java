interface Boa
{
	void banking();
	void finance();
	void insurance();
}
abstract class BoaBanking implements Boa
{
	public void banking()
	{
		System.out.println("logics for banking implementation");
	}
}
abstract class BoaFinance extends BoaBanking
{
	public void finance()
	{
		System.out.println("logics for banking implementation");
	}
}
class BoaInsurance extends BoaFinance
{
	public void insurance()
	{
		System.out.println("logics for insurance Implemantation");
	}
}
class Example2
{		
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		BoaInsurance cust1 = new BoaInsurance();
		cust1.banking();
		cust1.finance();
		cust1.insurance();
		System.out.println("Stop @ Cyber Success");		
	}
}	