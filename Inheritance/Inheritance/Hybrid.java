class A
{
	void m1()
	{
	 System.out.println("Inside m1 Method - A");
	}
}
class B  extends A
{
	void m2()
	{
		System.out.println("Inside m2 Mehtod - B");
	}
}
class C extends A
{
	void m3()
	{
		System.out.println("Inside m3 mathod - c");
	}
}
class D extends B
{

}
class E  extends C
{

}
class Hybrid
{
	public static void main(String args[])
	{
		A a1= new A(); a1.m1();			 System.out.println("__________");
		B b1= new B(); b1.m1(); b1.m2(); System.out.println("__________");
		C c1= new C(); c1.m1(); c1.m3(); System.out.println("__________");
		D d1= new D(); d1.m1(); d1.m2(); System.out.println("__________");
		E e1= new E(); e1.m1(); e1.m3(); System.out.println("__________");
	}
}
//Hybrid Inheritance--> It is combination of Single and hirarchial Inheritance.