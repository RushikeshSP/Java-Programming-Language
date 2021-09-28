interface SIM
{
	public void sendSMS();
	public void dialCall();
	
}

class Airtel implements SIM
{
	public void sendSMS()
	{
		System.out.println("SMS Send Successfully Using Airtel SIM.");
	}
	public void dialCall()
	{
		System.out.println("Call Connected Successfully Using Airtel SIM.");
	}
}

class Idea implements SIM
{
	public void sendSMS()
	{
		System.out.println("SMS Send Successfully Using Idea SIM.");
	}
	public void dialCall()
	{
		System.out.println("Call Connected Successfully Using Idea SIM.");
	}
}

class Jio implements SIM
{
	public void sendSMS()
	{
		System.out.println("SMS Send Successfully Using Jio SIM.");
	}
	public void dialCall()
	{
		System.out.println("Call Connected Successfully Using Jio SIM.");
	}
}

class Mobile
{
	public void insertSIM(SIM sim)
	{
		sim.sendSMS();
		sim.dialCall();
	}
}

class Mobile_User
{
	public static void main(String args[])
	{
		Mobile iphone = new Mobile();
		
		iphone.insertSIM(new Airtel());
		System.out.println("\n");
		
		iphone.insertSIM(new Idea());
		System.out.println("\n");
		
		iphone.insertSIM(new Jio());
	}
}