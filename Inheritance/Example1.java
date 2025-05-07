class Parent
{
	int a = 100;
}
class Child extends Parent
{
	float b = 200.5f;
}
class Example1
{
	public static void main(String args[])
	{
		System.out.println("Start @ cyber Success");
		//Parent
		Parent p = new Parent();
		System.out.println(p.a);
		//System.out.println(p.b);
		
		System.out.println("_ _ _ _ _ _ _ _ _");
		
		//Child 
		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println("Stop @ cyber Suucess");
	}
}