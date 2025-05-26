abstract class Demo
{
	abstract void test1();
	abstract void test2();
} 
abstract class Sample1 extends Demo
{
	void test1()
	{
		System.out.println("Inside test1 method - Sample1");
	}
}
class Sample2 extends Sample1
{
	void test2()
	{
		System.out.println("Inside test2 method - Sample2");
	}
}
class Example4
{
	public static void main(String args[])
	{
		Sample2 ref = new Sample2();
		ref.test1();
		ref.test2();
	}
}