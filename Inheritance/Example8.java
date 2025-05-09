class Demo
{
	Demo()
	{
		System.out.println("Inside Demo 0 args const");
	}
	Demo(int a)
	{
		this();
		System.out.println("Inside Demo 1 agrs const");
	}
}																																			    
class Sample extends Demo
{
	 Sample()
	{
		 this(200.2f);
		System.out.println("Inside Sample 0 args const");
	}
	 Sample(float b)
	{
		 super(10);
		System.out.println("Inside Sample 1 args const");
	}
}
class Example8
{
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		Sample s = new Sample();
		System.out.println("Stop @ cyber Success");
	}
}