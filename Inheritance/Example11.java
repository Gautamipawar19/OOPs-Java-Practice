class Demo
{
	Demo(int a)
	{
		System.out.println("Inside Demo 1 args const");
	}
}
class Sample extends Demo
{
	Sample()
	{
		super(10);
	   System.out.println("Inside Demo 0 args const ");
	}
}
class Example11
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		new Sample();
		System.out.println("Stop @ Cyber Success");
	}

}