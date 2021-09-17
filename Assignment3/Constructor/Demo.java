class Demo
{ 
	int a;
	
	Demo()
	{
		System.out.println("Inside Parameterless constructor.");
	}
	Demo(int a)
	{
		this.a = a;
		System.out.println("Inside Parameterised constructor.");
	}
	Demo(Demo d2)
	{
		System.out.printf("%d", d2.a);
	}
}

class Test
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		Demo d2 = new Demo(10);
		Demo d3 = new Demo(d2);
	}
}