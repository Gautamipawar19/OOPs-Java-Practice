class Example7
{
	Example7(char x)
	{
		System.out.println("Inside m1 method - char args const");
	}
	Example7(int a, float b)
	{
		System.out.println("Inside m1 method - int float args const");
	}
	Example7(boolean y)
	{
		System.out.println("Inside m1 method - boolean args const");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example7 ref = new Example7(10, 20.5f);
		System.out.println("Stop @ Cyber Success");
	}
}