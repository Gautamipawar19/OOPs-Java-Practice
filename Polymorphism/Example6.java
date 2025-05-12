class Example6
{
	Example6(float a)
	{
		System.out.println("Inside m1 method - float args const");
	}
	Example6(int b)
	{
		System.out.println("Inside m1 method - int args const");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example6 ref = new Example6(10.5f);
		System.out.println("Stop @ Cyber Success");
	}
}