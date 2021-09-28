// Java program for Method Hiding

class Demo  
{  
	static void method1()  
	{  
		System.out.println("Inside Method-1 of the Demo class.");  
	}  
	void method2()  
	{  
		System.out.println("Inside Method-2 of the Demo class.");  
	}  
}  

 
class Main extends Demo  
{  
	static void method1()  
	{  
		System.out.println("Inside Method-1 of the Main class.");  
	}  
	
	void method2()  
	{  
		System.out.println("Inside Method-2 of the Main class.");  
	}  
	
	
	public static void main(String args[])  
	{  
		Demo d1 = new Demo();  
		
		Demo d2 = new Main();  
		
		d1.method1();  
		d2.method1();  
		
		d1.method2();  
		d2.method2();  
	}  
}  