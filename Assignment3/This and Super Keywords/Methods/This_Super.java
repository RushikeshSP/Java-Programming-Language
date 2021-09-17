class Parent
{
	void fun()
	{
		
		System.out.println("Parent fun method.");
	}
	
	void gun()
	{
		System.out.println("Parent gun method.");
	}
}

class Child extends Parent
{
	void fun()
	{
		System.out.println("Child fun method.");
	}
	
	void gun()
	{
		this.fun();
		super.fun();
		super.gun();
		System.out.println("child gun method.");
	}
	
	public static void main(String args[])
	{
		Child C = new Child();
		C.gun();
	}
}