class Outer
{  	static int var1 =100;
	class Inner
	{
		float var2 =200.5f;
		void m1()
		{
			System.out.println("Inside m1 method");
			System.out.println(var1 + var2);
		}
	}
}
class Example4
{
	public static void main(String agrs[])
	{
		new Outer().new Inner().m1();	
	}
}