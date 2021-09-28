class Employee
{	
	int a = 10;
	String name;
	String add;
	float sal;
	
	Employee(String name, String add, float sal)
	{
		this.name = name;
		this.add = add;
		this.sal = sal;
	}
	
	float Calculate_Salary()
	{
		return this.sal;
	}
}

class Manager extends Employee
{
	int a = 20;
	float bonus;
	
	Manager(String name, String add, float sal, float bonus)
	{
		super(name, add, sal);
		this.bonus = bonus;
	}
	
	float Calculate_Salary()
	{
		return (this.sal * this.bonus);
	}
}

class Developer extends Employee
{
	float IT;
	
	Developer(String name, String add, float sal, float IT)
	{
		super(name, add, sal);
		this.IT = IT;
	}
	
	float Calculate_Salary()
	{
		return (this.sal - this.IT);
	}
}

class Salesman extends Employee
{
	float insentive;
	
	Salesman(String name, String add, float sal, float insentive)
	{
		super(name, add, sal);
		this.insentive = insentive;
	}
	
	float Calculate_Salary()
	{
		return (this.sal + this.insentive);
	}
}

class main
{
	public static void main(String args[])
	{
		Employee rushikesh = new Employee("Rushikesh", "SP", 200000.0f);
		System.out.println(rushikesh.Calculate_Salary());
		System.out.println(rushikesh.a);
		
		Employee ashutosh = new Manager("Ashutosh", "Nashik", 200000.0f, 2);
		System.out.println(ashutosh.Calculate_Salary());
		
		Employee aditya = new Developer("Aditya", "Bhenda BK", 200000.0f, 10000);
		System.out.println(aditya.Calculate_Salary());
		
		Employee sumit = new Salesman("Sumit", "SarolePathar", 200000.0f, 10000);
		System.out.println(sumit.Calculate_Salary());
	}
}