abstract class Demo
{
	static 
	{
		System.out.println("Inside static blocks - Demo");
	}
}
class Example12	extends Demo
{
	static 
	{								 
		System.out.println("Inside static blocks - Example12");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example12 ref = new Example12();
		System.out.println("Stop @ Cyber Success");
	}
}