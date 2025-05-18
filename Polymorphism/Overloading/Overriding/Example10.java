class A
{
	int a = 100;
	void m1()
	{
		System.out.println("Inside m1 method - A " +a);
	}
}
class B extends A
{
	float b = 200.5f;
	void m2()
	{
		System.out.println("Inside m2 method - B " +b);
	}
}
class C extends B
{
	char c = 'x';
	void m3()
	{
		System.out.println("Inside m3 method - C " +c);
	}
}
class Example10
{ 
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		A a11 = new C();
		a11.m1(); 
		System.out.println("_ __ _ __ __ _ _ _ _");
		B b11 =(B) a11;
		b11.m1(); b11.m2();
		System.out.println("_ _ _ _ _ _ _ _ _ _ _");
		C c11 =(C) b11;
		c11.m1();  c11.m2(); c11.m3();
		System.out.println("Stop @ Cyber Success");
	}
}