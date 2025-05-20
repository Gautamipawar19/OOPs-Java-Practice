class Rbi
{
	void loans()
	{
		System.out.println("Rbi min ROI @ 8%");
	}
	final void activation()
	{
		System.out.println("activation @ 1%");
	}
}
class HDFC extends Rbi
{
	void loans()
	{
		System.out.println("HDFC min ROI @ 15%");
	}
	/*void activation()
	{
		System.out.println("Activation @ 5%"); 
	}*/		
}
class Icici extends Rbi
{
	void loans()
	{
		System.out.println("Icici min ROI @ 15.5%");
	}
}
class Yes extends Rbi
{
	void loans()
	{
		System.out.println("Yes min ROI @ 14.5%");
	}
}
class Example14
{
	public static void main(String args[])
	{
		System.out.println("Start  @ Cyber Success");
		Rbi cust1 = new HDFC();
		cust1.loans();
		cust1.activation();
		Rbi cust2 = new Yes();
		cust2.loans();
		System.out.println("Stop @ Cyber Success");
	}
}