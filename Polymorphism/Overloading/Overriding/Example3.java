class A
{
	int m1()
	{
		System.out.println("Inside m1 method - A");
		return 10;
	}
}
class B extends A
{
	int m1()
	{
		System.out.println("Inside m1 method - B");
		return 100;
	}
}
class Example3
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		B b1 = new B();
		b1.m1();
		System.out.println("Stop @ Cyber Success");
	}
	
}