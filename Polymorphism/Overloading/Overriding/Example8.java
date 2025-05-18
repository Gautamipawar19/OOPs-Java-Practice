class A
{
	void m1()
	{
		System.out.println("Inside m1 method - A");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("Inside m2 method - B");
	}
}
class Example8
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		B b1 = new B();
		b1.m1(); b1.m2();
		System.out.println("_ _ _ _ _ _ _ _  _ _ _ _ _");
		A a11 = new B();//UpCasting
		a11.m1();
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ __");
		B b22 =(B)a11; //DownCasting
		b22.m1();
		b22.m2();
		System.out.println("Stop @ Cyber Success");
	}
}