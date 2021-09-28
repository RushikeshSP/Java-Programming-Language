class Parent
{
	Parent()
	{
		System.out.println("Parent Parameterless Constructor.");
	}
	
	Parent(int a)
	{
		this();
		System.out.println("Parent Parameterised Constructor.");
	}
}
class Child extends Parent
{
	Child()
	{
		super(20);
		System.out.println("Child Parameterless Constructor.");
	}
	
	Child(int a)
	{
		this();
		System.out.println("Child Parameterised Constructor.");
	}
}

class Test
{
	public static void main(String args[])
	{
		Child C = new Child(10);
	}
}