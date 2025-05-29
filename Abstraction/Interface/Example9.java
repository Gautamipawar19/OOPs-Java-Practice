interface Sample
{
	void m1();
}
class Demo implements Sample
{
	public void m1()
	{
		System.out.println("inside m1 method - Demo");
	}
}
class Example9
{
	public static void main(String args[])
	{									   
		System.out.println("Start @ Cyber Success");
		Sample s = new Demo();
		s.m1();
		System.out.println("Stop @ Cyber Success");
	}
}