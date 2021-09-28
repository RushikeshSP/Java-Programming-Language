class Demo
{
	protected int a = 10;
	protected int b = 20;
	public int c = 30;
	public int d = 40;
	private int e = 50;
	private int f = 60;
		
	void display()
	{
		System.out.println("Protected a = "+ a);
		System.out.println("Protected b = "+ b);
		System.out.println("public c = "+ c);
		System.out.println("public d = "+ d);
		System.out.println("private e = "+ e);
		System.out.println("private f = "+ f);
	}
}

class Demo2 extends Demo
{
	void display()
	{
		System.out.println("\n");
		System.out.println("Protected a = "+ a);
		System.out.println("Protected b = "+ b);
		System.out.println("public c = "+ c);
		System.out.println("public d = "+ d);
	}
}

class Test
{
	
	public static void main(String args[])
	{
		Demo d = new Demo();
		d.display();
		
		Demo2 d2 = new Demo2();
		d2.display();
	}
}