abstract class Demo
{  
	abstract void m1();
	abstract void m2();
}

class Example21
{
	Demo d = new Demo()
	{
	void m1()
		{
			System.out.println("Inside m1 method");
		}
		void m2()
		{
			System.out.println("Inside m2 method");
		} 
	};
	public static void main(String args[])
	{
		  Example21 ref = new Example21();
		  ref.d.m1();
		  ref.d.m2();
		
	}
}