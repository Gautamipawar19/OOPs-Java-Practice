class Demo
{
	static float b=20.5f;
	void m1()
	{
		class Sample
		{
			int a=10;
		}
		System.out.println(Demo.b + new Sample().a);
	}
}
class Example12
{
	public static void main(String args[])
	{
		Demo d =new Demo();
		d.m1();
	}
}