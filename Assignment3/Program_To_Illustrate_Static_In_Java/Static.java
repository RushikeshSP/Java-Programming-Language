/*

Que : Write a java program to illustrate static in java. (Static - block, field, method)
Owner: Rushikesh Sanjay Pokharkar
Batch: PPA9

*/

//                              *********** Solution ************

import java.util.Scanner; // Import necessary classes.

class College
{
	static String college_code, college_name = "AVCOE"; // created the static fields.
	
	static // Created the static block to initialize the static field.
	{
		college_code = "deij54965"; // Initialize the static field in static block.
	}
	
	void books() // created the non-static method.
	{
		System.out.println("All books of college are avilable here.");
	}
	
	static void labs() // created the static method.
	{
		System.out.println("All Labs Information is in this block.");
	}
	
}

class Students
{
	int rollNo, id;
	String name, div;
	
	Students(int rollNo, int id, String name, String div) // created the constructor to initialize the non-static fields.
	{
		this.rollNo = rollNo;
		this.id = id;
		this.name = name;
		this.div = div;
	}
	
	void print_details() // method to print the details of students including static and non-static fields.
	{
		System.out.printf("College Name of Student: %s\n", College.college_name); // Access the static field using class name.
		System.out.printf("College code: %s\n", College.college_code); // Access the static field using class name.
		System.out.printf("Name of student: %s\n", name);
		System.out.printf("Division of student: %s\n", div);
		System.out.printf("Id of student: %d\n", id);
		System.out.printf("Roll no of student: %d\n", rollNo);
	}
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in); // Created the scanner class object.
		
		System.out.print("Enter Name of Student1: ");
		String name1 = sc.nextLine();
		System.out.print("Enter Div: ");
		String div1 = sc.nextLine();
		System.out.print("Enter rollNo of Student: ");
		int rollNo1 = sc.nextInt();
		System.out.print("Enter id of Student: ");
		int id1 = sc.nextInt();
		Students s1 = new Students(rollNo1, id1, name1, div1); // created the first object of student class.
		s1.print_details();
		College c = new College();
		c.books(); // Accessed the non-static method by creating the object of the class.
		
		
		System.out.print("Enter Name of Student2: ");
		sc.nextLine();
		String name2 = sc.nextLine();
		System.out.print("Enter Div: ");
		String div2 = sc.nextLine();
		System.out.print("Enter rollNo of Student: ");
		int rollNo2 = sc.nextInt();
		System.out.print("Enter id of Student: ");
		int id2 = sc.nextInt();
		Students s2 = new Students(rollNo2, id2, name2, div2); // created the second object of the class.
		s2.print_details();
		College.labs(); // Accessed the static method usint the class name
		
	}

}

