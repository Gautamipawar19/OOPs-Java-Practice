abstract class Demo
{
	Demo()
	{
		System.out.println("Inside 0 args Const - Demo");
	}
}
class Example10 extends Demo
{
	{
		System.out.println("Inside Non-Static Blocks - Example10");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example10 ref = new Example10();
		System.out.println("Stop @ Cyber Success");
	}
}