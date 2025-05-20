class Sample
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	void m3()
	{
		System.out.println("Inside m3 method");
	}
}
class Demo extends Sample
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class Example12
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Sample s = new Demo();
		s.m1();//no UpCatsing ->With Overriding 
		//s.m2();With UpCatsing ->Without Overriding 
		s.m3();
		System.out.println("Stop @ Cyber Success");
	}
}