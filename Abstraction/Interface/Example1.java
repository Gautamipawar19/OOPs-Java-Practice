interface IT1
{
	void m1();
}
class Example1 implements IT1
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String args[])
	{
		System.out.println("start @ Cyber Success");
		  Example1 ref = new Example1();
		  ref.m1();
		System.out.println("Stop @ Cyber Success");
	}
}