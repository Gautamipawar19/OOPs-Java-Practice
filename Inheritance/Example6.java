class Demo
{
	Demo()
	{
		System.out.println("Inside Demo 0 args const") ;
	}
}
class Sample extends Demo
{
	Sample()
	{	  
		System.out.println("Inside Sample 0 args const");
		super();  
	}
}
class Example6
{
	public static void main(String args[])
	{
		Sample s = new Sample();
	}
}
//call to super must be first statement in constructor.