abstract class Demo
{
	Demo()
	{
		System.out.println("Inside 0 args const - Demo");
	}
}
class Example8 extends Demo
{
	Example8()
	{
		System.out.println("Inside 0 args const - Example8");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example8 ref= new Example8();
		System.out.println("Stop @ Cyber Success");
	}
}