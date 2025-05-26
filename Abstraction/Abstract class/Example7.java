abstract class Demo
{
	  abstract void m1();
	  abstract void m2();
	  abstract void m3();
}
abstract class Sample1 extends Demo
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
abstract class Sample2 extends Sample1
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class Sample3 extends Sample2
{
	void m3()
	{
		System.out.println("Inside m3 method");
	}
}
class Example7 
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Sample3 s = new Sample3();
		s.m1(); s.m2(); s.m3();
		System.out.println("Stop @ Cyber Success");
	}
}