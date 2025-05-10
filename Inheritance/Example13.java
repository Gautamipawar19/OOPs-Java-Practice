class Sample
{
	{
		System.out.println("Inside Non-Static Blocks - Sample");
	}
}
class Demo extends Sample
{
	Demo()
	{
		System.out.println("Inside 0 args Const - Demo ");
	}
}
class Example13
{
	public static void main(String args[])
	{
		System.out.println("Start");
		Demo d = new Demo();
		System.out.println("Stop");
	}
}