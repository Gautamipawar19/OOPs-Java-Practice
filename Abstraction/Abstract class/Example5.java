abstract class Demo
{
	abstract void test1();
	void test2()
	{
		System.out.println("Inside test2 method - Demo");
	}
}
class Example5 extends Demo
{
	void test1()
	{
		System.out.println("Inside test1 method - example5");
	}
	public static void main(String args[])
	{
		System.out.println("Inside main method");
		Example5 e = new Example5();
		e.test1();
		e.test2();
	}
}