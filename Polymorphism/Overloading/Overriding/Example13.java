class Sample
{
	static void test1()
	{
		   System.out.println("Inside test1 method - Sample");
	}
}
class Demo extends Sample
{
	static void test1()
	{
		System.out.println("Inside test1 method - Demo");
	}
}
class Example13
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Sample s = new Demo();
		s.test1();
		System.out.println("Stop @ Cyber Success");
	}
}