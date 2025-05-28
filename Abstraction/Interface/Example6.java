interface Zomato
{
	void Foodcategories();
	void Addtocart();
	void Payment();
}
class zomatoAdatpterclass implements Zomato
{
	public void  Foodcategories()
	{	
	}
	public void Addtocart()
	{
	}
	public void Payment()
	{
	}
}
class zomatofoodcategories extends zomatoAdatpterclass 
{
	public void Foodcategories()
	{
		System.out.println("Logics to implements Food Categories ");
	}
}
class Example6
{
	public static void main(String args[])
	{
		System.out.println("Star @ Cyber Success");
		zomatofoodcategories ref = new zomatofoodcategories();
		ref.Foodcategories();
		System.out.println("Stop @ Cyber Success");
	}
}