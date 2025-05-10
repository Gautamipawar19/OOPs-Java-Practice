class Sample
{
	{
		System.out.println("Inside Non-Static Blocks - Sample");
	}
	Sample()
	{
		System.out.println("Inside 0 args const - Sample");
	}
}
class Demo extends Sample
{
	{
		System.out.println("Inside Non-Static Blocks  - Demo");
	}
	Demo()
	{
		System.out.println("Inside 0 args Const - Demo ");
	}
}
class Example12
{
	public static void main(String args[])
	{
		System.out.println("Start");
		Demo d = new Demo();
		System.out.println("Stop");
	}
}