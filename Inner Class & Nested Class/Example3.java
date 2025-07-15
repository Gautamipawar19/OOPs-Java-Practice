class Outer
{
	int var1= 100;
	void m1()
	{
		System.out.println("Inside m1 method");		
		Inner i = new Inner();
		System.out.println(var1 + i.var2);
	}
	class Inner
	{
		float var2 = 200.5f;
	}
}
class Example3
{
	public static void main(String args[])
	{
		new Outer().m1();
	}
}