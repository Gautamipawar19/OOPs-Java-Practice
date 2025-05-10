class Sample
{
	Sample()
	{
		System.out.println("Inside 0 args Const - Sample");
	}
	Sample(int a)
	{
		System.out.println("Inside 1 args const - Sample");
	}
}
class Demo extends Sample
{
	{
		System.out.println("Inside Non-Static Blocks  - Demo");
	}
}
class Example14
{
	public static void main(String args[])
	{
		System.out.println("Start");
		Demo d = new Demo();
		System.out.println("Stop");
	}
}