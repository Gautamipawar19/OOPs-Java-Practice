class Outer
{
	int var1 =100;
	class Inner
	{
		float var2 = 200.5f;
	}
}
class Example1
{
	public static void main(String args[])
	{
		 //Outer Class  Var1
		 Outer o = new Outer();
		 System.out.println(o.var1);
		 Outer.Inner i = o.new Inner();
		System.out.println(i.var2);
	}
}