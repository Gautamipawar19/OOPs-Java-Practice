class Pvrmovie
{
	private static Pvrmovies mticket;
	private static boolean ticketstatus = false;
	private Pvrmovies()
	{
		System.out.println("Welcome to Pvrmovies Entertinment.....");
	}
	public static Pvrmovies bookTicket()
	{
		System.out.println("please wait your ticket booking is in progress");
		if(ticketstatus == false)
		{							  
			mticket = new Pvrmovies();
			ticketstatus = true;
		}
		return mticket;
	}
}
class BookmyShow
{
	public static void main(String args[])
	{
		Pvrmovies custTicket1 = Pvrmovies.bookTicket();
		System.out.println(custTicket1);//old address
		custTicket1 = Pvrmovies.bookTicket();
		System.out.println(custTicket1);//new address //old address
   	}
}