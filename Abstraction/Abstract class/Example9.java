abstract class Demo
{	{
		System.out.println("Inside Non - Static blocks -Demo");
	}
	Demo()
	{
		System.out.println("Inside 0 args const - Demo");
	}
}
class Example9 extends Demo
{
	{
		System.out.println("Inside Non - Static blocks - Example9");
	}
	Example9()
	{
		System.out.println("Inside 0 args const - Example9");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example9 ref= new Example9();
		System.out.println("Stop @ Cyber Success");
	}
}