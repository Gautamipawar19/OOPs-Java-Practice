class Demo
{
	static float b=200.5f;
	static class Sample
	{
		static int a=100;
		static void m1()
		{
			System.out.println(a+b);
		}
	}
		
}
class Example15
{
	public static void main(String args[])
	{
		Demo.Sample.m1();
	}
}