abstract class Demo
{
	abstract void test1();
	void test2()
	{
		System.out.println("Inside test2 method - Demo");
	}
}
class Example6 extends Demo
{
	void test1()
	{
		System.out.println("Inside test1 method - Example6");
	}
	public static void main(String args[])
	{
		System.out.println("Inside main method");
		Example6 ref = new Example6();
		ref.test1();
		ref.test2();
	}
}