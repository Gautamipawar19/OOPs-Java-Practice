//Parent/Base/Super
class Demo
{
	Demo()
	{
		System.out.println("Inside Demo 0 args const") ;
	}
}
//Child/Derived/Sub
class Sample extends Demo
{
	Sample()
	{	  
		super();
		System.out.println("Inside Sample 0 args const");
	}
}
class Example5
{
	public static void main(String args[])
	{
		Sample s = new Sample();
	}
}