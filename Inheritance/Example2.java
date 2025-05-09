final class Parent
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Child  extends Parent
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class Example2
{
	public static void main(String args[])
	{
	 Child c = new Child();
	 c.m1(); c.m2();
	}
}
//cannot inherit from final Parent.
