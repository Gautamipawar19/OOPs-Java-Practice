class Example1
{
	void m1()
	{
		System.out.println("Inside m1 method - 0 args");
	}
	void m1(int a)
	{
		System.out.println("Inside m2 method - 1 args ");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example1 ref = new Example1();
		ref.m1();
		System.out.println("Stop @ Cyber Success");
	}
}