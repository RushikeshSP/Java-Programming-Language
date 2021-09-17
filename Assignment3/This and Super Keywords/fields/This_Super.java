class College
{
	String college_name;
	String college_id;
	String address;
	
	College(String college_id, String college_name, String address)
	{
		this();
		this.college_id = college_id;
		this.college_name = college_name;
		this.address = address;
	}
	College()
	{
		System.out.println("Inside College.");
	}
}

class Student extends College
{
	String stud_name;
	int stud_rollno;
	String address;
	
	Student(String stud_name, int stud_rollno, String address)
	{
		super("011", "AVCOE", "Ghulewadi, Sangamner.");
		this.stud_name = stud_name;
		this.stud_rollno = stud_rollno;
		this.address = address;
	}
	
	Student()
	{
		System.out.println("Inside Student.");
	}
	
	void printDetails()
	{
		System.out.println(this.stud_name);
		System.out.println(stud_rollno);
		System.out.println(this.address);
		System.out.println(super.college_name);
		System.out.println(this.college_id);
		System.out.println(super.address);
	}
	
	public static void main(String args[])
	{
		Student S = new Student("Rushikesh", 3227, "S.P.");
		S.printDetails();
	}
}