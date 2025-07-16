class Outer
{
    int a = 1000;
	class Inner extends Outer
	{
		int a=2000;
		void m1(int a)
		{
			System.out.println("Inside m1 method");
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(super.a);
		}
	}
}
class Example8
{
	public static void main(String args[])
	{
		new Outer().new Inner().m1(3000);	
	}
}