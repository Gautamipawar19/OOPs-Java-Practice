abstract class Demo
{
	abstract void m1();
} 
class Sample extends Demo 
{
	void m1()
	{
		System.out.println("Inside m2 method - Sample");
	}
}
class Example3
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Sample ref = new Sample();
		ref.m1();
		System.out.println("Stop @ Cyber Success");
	}
}