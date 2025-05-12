class Example3
{
	void m1(float b)
	{
		System.out.println("Inside m1 method - float args");
	}
	void m1(char x, boolean y)
	{
		System.out.println("Inside m1 method - char, boolean args");
	}
	void m1(int a)
	{
		System.out.println("Inside m1 method - int args");
	}
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Example3 ref = new Example3();
		ref.m1('x', true);
		System.out.println("Stop @ Cyber Success");
	}
}
