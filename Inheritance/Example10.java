class Demo
{
	Demo()
	{
		System.out.println("Inside Demo 0 args const");
	}
	Demo(int a)
	{
		this();
		System.out.println("Inside Demo 1 args const");
	}
}
class Sample extends Demo
{
	Sample()
	{
		super(10);
	}
}
class Example10
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Sample s = new Sample();
		System.out.println("Stop @ Cyber Success");
	}

}