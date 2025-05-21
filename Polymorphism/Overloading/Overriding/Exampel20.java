class Sample
{
	int a=10;
}
class Demo extends Sample
{
	int a=100;
}
class Exampel20
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Sample ref = new Demo();
		System.out.println(ref.a);
		System.out.println("Stop @ Cyber Success");
	}
}