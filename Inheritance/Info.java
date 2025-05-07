class College
{
	College()
	{
		
	}
}
class Staff extends College
{
	String S = "Yadav Sir";
	Staff()
	{
		System.out.println("staff name is : ");
	}
}
class Student extends College
{
	String s1 ="Gauri";
	Student()
	{
		System.out.println("Student Name is : ");
	}
}  
class Attend extends Student
{
	String a = "yes";
}
class Info
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		System.out.println("College staff members");
		Staff st1 = new Staff();
		System.out.println(st1.S);

		System.out.println();

		Attend a1 = new Attend();
		System.out.println(a1.s1);
		System.out.println(a1.a);
		System.out.println("Stop @ Cyber Success");
	}
}