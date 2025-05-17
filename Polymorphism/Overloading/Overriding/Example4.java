class A
{
	int m1()
	{
		System.out.println("Inside m1 method - int");
		return 100;
	}
}
class B extends A
{
	float m1()
	{
		System.out.println("Inside m1 method - float");
		return 200.5f;
	}
}
class Example4
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		 B b1 = new B();
		 b1.m1();
		System.out.println("Stop @ Cyber Success");
	}
}
