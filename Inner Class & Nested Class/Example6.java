class Outer							  
{
	void m1()
	{
		  System.out.println("Inside m1 method");
		  Inner i = new Inner();
		  System.out.println(i.var1 + i.var2);
	}
	class Inner
	{
	   private int var1 =100;
	   private float var2= 200.5f;
	}
}
class Example6
{
	public static void main(String args[])
	{	 
		new Outer().m1();
	}
}