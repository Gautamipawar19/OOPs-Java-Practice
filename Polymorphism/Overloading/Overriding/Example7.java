class A
{
	//Overridden
	final m1()
	{
		System.out.println("Inside m1 method - A");
	}
}
class B extends A
{
	//Overriding
	void m1()
	{
		System.out.println("Inside m1 method - B");
	}
}
class Example7
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		B b1 = new B();
		b1.m1();
		System.out.println("Stop @ Cyber Success");	
	}
}