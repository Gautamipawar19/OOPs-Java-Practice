class Animal
{
	String a="Animals";
	Animal()
	{
		System.out.println("Animal is Dog ");
	}
}
class Dog extends Animal
{
	String d ="Dog";
	Dog()
	{
		System.out.println("Dog is a pet animal ");
	}
}
class Pet extends Dog
{	
	String p="Pet";
	{
		System.out.println("pet is animal type");		 
	}
}
class Example
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		Pet d1 = new Pet();
		System.out.println(d1.a);
		System.out.println(d1.d);
		System.out.println(d1.p);
		System.out.println("Stop @ Cyber Success");
		
	}
}