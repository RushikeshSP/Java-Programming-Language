class Demo
{	
	int a;
	
	class InnerClass
	{
		int a;
		void innerdisplay()
		{
			System.out.println("Inside inner class.");
		}
	}
	
	void display()
	{
		System.out.println("Inside display method of Outer class.");
		InnerClass in = new InnerClass();
		in.innerdisplay();
	}
	
}

class Test
{
	public static void main(String args[])
	{
		System.out.println("Inside main method of class Test.");
		Demo d = new Demo();
		d.display();
		
	}
	
}