class Outer
{
	private int var1=100;
	private float var2=200.5f;
	class Inner
	{
		void m1()
		{	   
			System.out.println("Inside m1 method");
			System.out.println(var1 + var2);
		}
	}
}
class Example5
{
	public static void main(String agrs[])
	{
		new Outer().new Inner().m1();
	}
}