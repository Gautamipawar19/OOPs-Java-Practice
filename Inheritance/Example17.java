class Parent
{
	int a=1000;
}
class Child extends Parent
{
	int a=100;
	void m1(int a)
	{
		System.out.println("Inside m1 method ");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
}
class Example17
{
	public static void main(String args[])
	 {
		System.out.println("Start @ Cyber Success");
		new Child().m1(10);
		System.out.println("Stop @ Cyber Success");
	 }
}