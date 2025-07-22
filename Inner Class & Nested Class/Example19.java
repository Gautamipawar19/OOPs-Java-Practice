class Demo
{
	float y =200.5f;
	static class Sample
	{  
		int x=100;
		void m1()
		{
			Demo d =new Demo();
			System.out.println(x+d.y);
		}
	}
}
class Example19
{
	public static void main(String args[])
	{
		  Demo.Sample ds = new Demo.Sample();
		  ds.m1();
	}
}