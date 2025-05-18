class A 
{
	void test1()
	{
		System.out.println("Inside test1 method");
	}
}
class B extends A
{
		void test2()
	{
		System.out.println("Inside test2 method");
	}   
}
class Demo
{
	static void m1(A ref)
	{		ref.test1();
		
	}
}
class Example11
{
	public static void main(String args[])
	{
		 A b1 = new B();
		 Demo.m1(b1);
	}
}