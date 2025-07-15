class Outer
{
	int var1 = 100;
	class Inner
	{
	   float var2 = 200.5f;
	   void m1()
		{
			System.out.println("Inside m1 mehtod");
			System.out.println(var1 + var2);
		}
	}
}
class Example2
{
	public static void main(String args[])
	{
		/*Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();*/
		new Outer().new Inner().m1();
	}
}