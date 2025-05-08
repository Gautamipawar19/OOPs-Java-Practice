class Parent
{
	int a=100;
	void m1()
	{
		System.out.println("Inside m1 method " +a);
	}
}
class Child extends Parent
{
	float b=200.5f;
	void m2()
	{
	System.out.println("Inside m2 method " +b);
	}
}
class SingleInheri
{	
    public static void main(String args[])
	{
		Parent p = new Parent();
		p.m1();
		System.out.println("______________");
		Child c = new Child();
		c.m1(); c.m2();
		System.out.println("______________");
	}
}