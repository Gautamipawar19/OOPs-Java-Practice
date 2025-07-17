class Demo
{
	void m1()
	{
		class Sample
		{
		   int a=100;
		} 
		   Sample s = new Sample();
		   System.out.println(s.a);
	}
}
class Example10
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		d.m1();
	}
}