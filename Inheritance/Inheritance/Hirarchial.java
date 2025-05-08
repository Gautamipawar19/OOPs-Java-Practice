class A
{
	int a=100;
	void m1()
	{
		System.out.println("Inside m1 Method " +a);
	}
}
class B extends A
{
	float b = 200.5f;
	void m2()
	{
		System.out.println("Inside m2 method " +b);
	}
}
class C extends A
{
	char c ='x';
	void m3()
	{
		System.out.println("Inside m3 method " +c);
	}
}
class D extends A
{
	boolean d = true;
	void m4()
	{
		System.out.println("Inside M4 method " +d);
	}
}
class Hirarchial
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.m1(); System.out.println("________");
		B b1 = new B();	   
		b1.m1(); b1.m1(); System.out.println("________");
		C c1 = new C();
		c1.m1(); c1.m3(); System.out.println("________");
		D d1 = new D();
		d1.m1(); d1.m4(); System.out.println("________");
	}

}