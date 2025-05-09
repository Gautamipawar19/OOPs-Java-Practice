class Demo
{
	static void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Sample extends Demo
{
	static void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class Example3
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.m1(); s.m2();
		System.out.println("________");

		Sample.m2();
		Sample.m1();
	}
}