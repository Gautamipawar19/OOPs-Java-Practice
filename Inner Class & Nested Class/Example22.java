interface It1
{  
	void m1();
	void m2();
}

class Example22
{
	It1 i = new It1()
	{
		public void m1()
		{
			System.out.println("Inside m1 method-->");
		}
		public void m2()
		{
			System.out.println("Inside m2 method-->");
		} 
	};
	public static void main(String args[])
	{
		  Example22 ref = new Example22();
		  ref.i.m1();
		  ref.i.m2();
		
	}
}