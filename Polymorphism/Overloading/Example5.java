class Example5
{
	Example5()
	{
		System.out.println("Inside m1 method - 0 args const");
	}
	Example5(int a)
	{
		System.out.println("Inside m1 method - 1 args Const");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example5 ref = new Example5();
		System.out.println("Stop @ Cyber Success");
	}
}