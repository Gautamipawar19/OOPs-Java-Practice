class Sample
{
	public void m1()
	{
		System.out.println("Inside m1 - Sample");
	}
}
class Demo extends Sample
{
	protected void m1()
	{
		System.out.println("Inside m1 - Demo");
	}
}
class Example19
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Sample ref = new Demo();
		ref.m1();
		System.out.println("Stop @ Cyber Success");
	}
}