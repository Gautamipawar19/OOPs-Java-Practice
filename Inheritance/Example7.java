class Demo
{
	Demo()
	{
		System.out.println("Inside Demo 0 args const");
	}
}
class Sample extends Demo
{
	 Sample()s
	{
		System.out.println("Inside Sample 0 args const");
	}
}
class Example7
{
	public static void main(String args[])
	{
		Sample s = new Sample();
	}
}