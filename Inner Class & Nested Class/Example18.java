class Demo
{
	float y =200.5f;
	void m1()
	{
		Sample s =new Sample();
		System.out.println(s.x+y);
	}
	static class Sample
	{  
		int x=100;
	}
}
class Example18
{
	public static void main(String args[])
	{
		  new Demo().m1();
	}
}