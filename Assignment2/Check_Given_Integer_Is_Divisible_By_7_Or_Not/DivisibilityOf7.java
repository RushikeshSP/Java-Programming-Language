/*

Que : 9. Write a java program to accept one integer from user and check whether given number is divisible by 7 or not (using divisibility condition)
Example: the number 371: 37 – (2×1) = 37 – 2 = 35; 3 – (2 × 5) = 3 – 10 = -7; thus, since -7 is divisible by 7, 371 is divisible by 7. 
Owner: Rushikesh Sanjay Pokharkar
Batch: PPA9

*/

//                              *********** Solution ************

import java.util.Scanner; // Import necessary classes

class DivisibilityOf7
{
	int check_divisibility(int num) // Method to check divisibility of 7 using divisibility conditions.
	{
		if(num < 0) // Condition if number is negative then make it positive.
		{
			return check_divisibility(-num);
		}
		
		if(num == 0 || num == 7) // if number is one digit and equal to 7  or 0 then return 1.
		{
			return 1;
		}
		
		if(num <= 9) // If number is one digit and not equal to 7 then return 0.
		{
			return 0;
		}
		
		int temp = num%10;
		temp = 2*temp;
		num = num/10;
		num = num - temp;
		
		return check_divisibility(num);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); // Created the object of class scanner to take input.
		
		System.out.print("Enter a Number: ");
		int num = sc.nextInt(); // Taking integer input using scanner class object.
		
		DivisibilityOf7 d = new DivisibilityOf7(); // Created the object of class to access the non-static methods.
		
		int result = d.check_divisibility(num);
		
		if(result == 1)
		{
			System.out.printf("The given number %d is divisible by 7.", num);
		}
		else
		{
			System.out.printf("The given number %d is Not divisible by 7.", num);
		}
		
	}
}