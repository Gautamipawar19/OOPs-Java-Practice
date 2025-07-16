class Outer
{
	int a = 100;
	class Inner
	{	
		int a=200;
		void m1(int a)
		{
			System.out.println("Inside m1 mehtod");
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Outer.this.a);
		}
	}
}
class Example7
{
	public static void main(String args[])
	{
		new Outer().new Inner().m1(300);
	}
}