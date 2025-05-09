class Demo
{
	Demo()
	{
		System.out.println("Inside Demo 0 args const");
	}
}
class Sample extends Demo
{
	Sample()
	{
		System.out.println("Inside Demo 0 args const");
	}
	Sample(float b)
	{
		System.out.println("Inside Demo 1 args const");
	}
}
class Example9
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Sample s1 = new Sample();
		Sample s2 = new Sample(10.5f);
		System.out.println("Stop @ Cyber Success");
	}

}