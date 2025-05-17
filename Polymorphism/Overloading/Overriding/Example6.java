class A
{
	A m1()
	{
		System.out.println("Inside m1 method - A >>>");
		return new A();
	}
}
class B extends A
{
	B m1()
	{
		System.out.println("Inside m1 method - B >>>");
		return new B();
	}
}
class Example6
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		B b1 = new B();
		b1.m1();
		System.out.println("Stop @ Cyber Success");
	}
}			