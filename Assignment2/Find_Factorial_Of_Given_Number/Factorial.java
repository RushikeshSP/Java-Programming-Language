/*

Que : 1. Write a java program to find out factorial of given number. (Using Scanner class).
Owner: Rushikesh Sanjay Pokharkar
Batch: PPA9

*/

//                              *********** Solution ************


import java.util.Scanner; // Import necessary classes.


class Factorial
{
	int calculate_factorial(int num) // Method for calculation of factorial of a number
	{
		if(num>0)
		{
			int fact = 1;
	
			for(int i = 1; i <= num; i++)
			{
				fact = fact * i;
			}
			return fact;
		}
		else
		{
			return 0;
		}
	}
	
	public static void main(String args[]) // Main method 
	{
		System.out.println("Enter a number: ");
		
		Scanner sc = new Scanner(System.in); // Created scanner class object for taking input
		int num = sc.nextInt(); // Taking input from user using scanner class object.
		
		Factorial f = new Factorial(); // Created object of a class Factorial for calling non-static methods.
		
		int result = f.calculate_factorial(num); // Passed input number for calculating factorial.
		
		System.out.printf("The factorial of %d is %d", num, result);
	}
}