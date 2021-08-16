/*

Que : 10.Write a java program to accept one string and one character from user and print count of given char in string.
Owner: Rushikesh Sanjay Pokharkar
Batch: PPA9

*/

//                              *********** Solution ************

import java.util.Scanner; // Import necessary classes

class CountChar
{
	int character_count(String str, char ch) // Method to count the count of character in given string.
	{
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == ch)
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); // Created the object of class scanner to take input.
		
		System.out.print("Enter a String: ");
		String str = sc.nextLine(); // Taking string input using scanner class object.
		
		System.out.print("Enter the Character to count: ");
		String ch = sc.next(); // taking string input using scanner class object.
		
		CountChar c = new CountChar(); // Created the object of class to access the non-static methods.
		
		int result = c.character_count(str, ch.charAt(0));
		
		System.out.printf("The count of '%c' in given string is: %d", ch.charAt(0), result);
	}
}