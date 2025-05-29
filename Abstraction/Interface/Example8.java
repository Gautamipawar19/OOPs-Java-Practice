abstract class Sample
{
	abstract void m1();
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class Demo extends Sample
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Example8
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Demo d = new Demo();
		d.m2();
		d.m1();
		System.out.println("Stop @ Cyber Success");
	}
}