package cyber.success;

class Sample
{
	public static void main(String args[])
	{
		System.out.println("Start @ Sample - main");
		System.out.println("Inside Sample class");
		new Demo().m1();
		Example5.m2();
		System.out.println("Stop @ Sample - main");
	}
}
class Demo
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Example5
{
	static void m2()
	{
		System.out.println("Inside m2 method");
	}
}