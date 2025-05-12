class HDFC
{
	HDFC(int adhaar, String custName)
	{
		System.out.println("Logics to open saving account");
	}
	HDFC(int adhaar, String custName, String compName)
	{
		System.out.println("logics to open Current account");
	}
}
class Example8
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		HDFC cust = new HDFC(12345, "Sita", "TCS"); 
		System.out.println("Stop @ Cyber Success");
	}
}