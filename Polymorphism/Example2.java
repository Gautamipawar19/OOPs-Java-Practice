class Example2
{
	void m1(int a)
	{
		System.out.println("Inside m1 method - int args ");
	}
	void m1(float b)
	{
		System.out.println("Inside m1 method - float args");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example2 ref = new Example2();
		ref.m1(10);
		System.out.println("Stop @ Cyber Success");
	}
}