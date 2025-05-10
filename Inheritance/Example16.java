class Sample
{ 
	static
	{
		System.out.println("Inside Static Block - Sample");
	}
	{
		System.out.println("Inside Non-Static blocks - Sample");
	}
	Sample()
	{
		System.out.println("Inside 0 args Const - Sample");
	}
}
class Demo extends Sample
{
	static
	{
		System.out.println("Inside Static Block - Demo");
	}
	{
		System.out.println("Inside Non-Static Blocks - Demo");
	}
	Demo()
	{
		  System.out.println("Inside 0 args Const -  Demo");
	}
}
class Example16
{
	public static void main(String args[])
	{
		System.out.println("Start");
		Demo d1 = new Demo();	//Create -> 1 object
		System.out.println("Stop");
	}
}