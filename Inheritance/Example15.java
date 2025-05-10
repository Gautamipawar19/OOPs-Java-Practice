class Sample
{ 
	static
	{
		System.out.println("Inside Static Block - Sample");
	}
}
class Demo extends Sample
{
	static
	{
		System.out.println("Inside Static Block - Demo");
	}
}
class Example15
{
	public static void main(String args[])
	{
		System.out.println("Start");
		Demo d1 = new Demo();
		System.out.println("Stop");
	}
}