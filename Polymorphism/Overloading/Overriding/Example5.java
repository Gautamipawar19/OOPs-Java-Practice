class Demo
{
}
class A
{
	Demo m1()
	{
		System.out.println("Inside m1 method - B");
		return new Demo();
	}
}
class B extends A
{
	Demo m1()
	{
		System.out.println("Inside m1 method - B");
		return new Demo();
	}
}
class Example5
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		B b1 = new B();
		b1.m1();
		System.out.println("Stop @ Cyber Success");
	}
}