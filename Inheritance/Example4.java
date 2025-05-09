class Demo
{
	static int a=100;
	static void m1()
	{
		System.out.println("Inside m1 method " +a);
	}
}
class Sample extends Demo
{ 
	static float b=200.5f;
	static void m2()
	{
		System.out.println("Inside m2 method " +b);
	}
}
class Example4
{
	public static void main(String args[])
	{
		Sample s  = new Sample();
		s.m1(); s.m2();
		System.out.println("_________________");	
		Sample.m2();
		Sample.m1();
	}
}