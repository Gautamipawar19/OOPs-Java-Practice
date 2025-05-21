class Sample
{
	private void m1()
	{
		System.out.println("Inside m1 - Sample");
	}
}
class Demo extends Sample
{
	void m1()
	{
		System.out.println("Inside m1 - Demo");
	}
}
class Example16
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Sample ref = new Demo();
		ref.m1();
		System.out.println("Stop @ Cyber Success");
	}
}