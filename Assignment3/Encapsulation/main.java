class Student
{
	private String name;
	private String address;
	private int rollno;
	
	void setname(String name)
	{
		this.name = name;
	}
	void setaddress(String address)
	{
		this.address = address;
	}
	void setrollno(int rollno)
	{
		this.rollno = rollno;
	}
	
	String getname()
	{
		return this.name;
	}
	String getaddress()
	{
		return this.address;
	}
	int getrollno()
	{
		return this.rollno;
	}
}

class Test
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.setname("Rushikesh");
		s.setaddress("Sarole Pathar.");
		s.setrollno(63);
		
		String name = s.getname();
		String address = s.getaddress();
		int rollno = s.getrollno();
		
		System.out.println("Name = "+ name);
		System.out.println("Address = "+ address);
		System.out.println("Roll No = "+ rollno);
	}
}