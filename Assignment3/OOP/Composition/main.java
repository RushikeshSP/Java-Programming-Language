class college
{
	int collegeid;
	String collegename;
	
	college(int collegeid, String collegename)
	{
		this.collegeid = collegeid;
		this.collegename = collegename;
	}
	
	void Display()
	{
		System.out.println("Inside Display method of college class.");
		System.out.println("College Id = "+ collegeid);
		System.out.println("College Name = "+ collegename);
	}
}

class Student
{
	college c = new college(111, "AVCOE");
	
	public static void main(String args[])
	{
		Student s = new Student();
		s.c.Display();
	}
}