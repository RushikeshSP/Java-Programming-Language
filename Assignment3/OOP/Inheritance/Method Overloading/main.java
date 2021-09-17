// Java program for Method Overloading

class Add 
{

	public int add(int x, int y)
	{
		return (x + y);
	}

	public int add(int x, int y, int z)
	{
		return (x + y + z);
	}

	public double add(double x, double y)
	{
		return (x + y);
	}
}

class main
{
	public static void main(String args[])
	{
		Add s = new Add();
		System.out.println(s.add(10, 20));
		System.out.println(s.add(10, 20, 30));
		System.out.println(s.add(10.5, 20.5));
	}
}

