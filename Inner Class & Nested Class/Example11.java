class Demo
{
	void m1()
	{
		class Sample
		{
		   int a=10;
		}
		Sample s = new Sample();
		System.out.println(s.a);
	}
	void m2()
	{
		class Sample
		{
			float b= 20.5f;
		}
		Sample s = new Sample();
		System.out.println(s.b);
	}
}
class Example11
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.m1();
		d.m2();
	}
}