interface It1
{
	interface It2
	{
		void m1();
	}
}
class Example7 implements It1.It2
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example7 ref = new Example7();
		ref.m1();
		System.out.println("Stop @ Cyber Success");
	}
}