/*

Que : 2. Write a java program to check whether given number is prime or not. (Using Scanner class).
Owner: Rushikesh Sanjay Pokharkar
Batch: PPA9

*/

//                              *********** Solution ************


import java.util.Scanner; // Import necessary classes.


class PrimeNumber
{
	int check_prime(int num) // Method to check number is prime or not.
	{
		int flag = 0;
		if(num>0)
		{
			for(int i = 2; i < num; i++)
			{
				if(num % i == 0)
				{
					flag = 1;
					break;
				}
			}
		}
		else
		{
			flag = 1;
		}
		return flag;
	}
	
	public static void main(String args[]) // Main method 
	{
		System.out.println("Enter a number: ");
		
		Scanner sc = new Scanner(System.in); // Created scanner class object for taking input
		int num = sc.nextInt(); // Taking input from user using scanner class object.
		
		PrimeNumber p = new PrimeNumber(); // Created object of a class for calling non-static methods.
		
		int result = p.check_prime(num); // Passed input number for checking prime number.
		
		if(result == 1)
		{
			System.out.printf("The given number %d is Not a Prime Number.", num);
		}
		else
		{
			System.out.printf("The given number %d is Prime Number.", num);	
		}
	}
}