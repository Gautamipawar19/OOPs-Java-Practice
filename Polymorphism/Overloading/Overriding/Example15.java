class ATMCard
{
	void  mobileno()
	{
		System.out.println("Mob NO:-9859451250");
	}
	final void pin()
	{
		System.out.println(4569);
	}
	final void account()
	{
		System.out.println(9895);
	}
}

class AccountNo extends ATMCard
{
	void  mobileno()
	{
		System.out.println("Mob NO:-9859451250");
	}
}


class Example15
{
	public static void main(String args[])
	{
		System.out.println("Start @ Cyber Success");
		ATMCard cust1 = new AccountNo();
		cust1.mobileno();
		cust1.pin();
		cust1.account();
		System.out.println("Stop @ Cyber Success");
	}
}