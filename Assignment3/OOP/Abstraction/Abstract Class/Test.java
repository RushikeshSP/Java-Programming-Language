abstract class Demo
{
	int a;
	
	Demo()
	{
		System.out.println("Inside Demo Constructor of Parent Demo Class.");
	}
	
	abstract void fun();
	
	void gun()
	{
		this.a = 20;
		System.out.println("Inside gun method of abstract class.");
	}
}


class Test extends Demo // If we not implement the abstract methods of the parent class then this class is also make abstract by complier.
{
	Test()
	{
		System.out.println("Inside Test Constructor of Child Test Class.");
	}

	void fun()
	{
		System.out.println("Abstract methode fun overrided in Test Class from abstract Class Demo.");
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Inside main method of Test Class.");
		
		//Demo d = new Demo();      // Cannot create instance of a abstract class 
		//d.gun();
		
		Test t = new Test();
		
	}
}


