class Demo
{
	float b=200.5f;
	void m1()
	{
		class Sample
		{
			int a=100;
		}
		System.out.println(b + new Sample().a);
	}
}
class Example13
{
	public static void main(String args[])
	{
		Demo d =new Demo();
		d.m1();
	}
}