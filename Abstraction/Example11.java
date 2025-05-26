abstract class Demo
{
	Demo(int a)
	{
		System.out.println("Inside 1 args Const - Demo");
	}
}
class Example11 extends Demo
{
	{
		System.out.println("Inside Non-Static Blocks - Example11");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example11 ref = new Example11();
		System.out.println("Stop @ Cyber Success");
	}
}
// constructor Demo in class Demo cannot be applied to given types;
//class Example11 extends Demo