class A
{
	void m1()
	{
		System.out.println("Inside m1 method - A - 0 args const ");
	}
}
class B extends  A
{
	void m1(int a)
	{
		System.out.println("Inside m1 method - B - 1 arg const");
	}
}
class Example2
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		B b1 = new B();
		b1.m1();
		System.out.println("Stop @ Cyber Success");
	}
}
/* It is not a concept of overriding because it a concept of overloading. */