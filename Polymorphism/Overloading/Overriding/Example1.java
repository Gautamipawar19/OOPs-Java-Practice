class A
{
	void m1()
	{
		System.out.println("Inside m1 method - A ");
	}
}
class B extends  A
{
	void m1()
	{
		System.out.println("Inside m1 method - B");
	}
}
class Example1
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		B b1 = new B();
		b1.m1();
		System.out.println("Stop @ Cyber Success");
	}
}