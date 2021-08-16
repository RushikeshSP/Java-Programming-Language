/*

Que : 5. Write a java program to check whether given number is Armstrong or not. (Using Scanner class).
Owner: Rushikesh Sanjay Pokharkar
Batch: PPA9

*/

//                              *********** Solution ************


import java.util.Scanner; // Import necessary classes.


class Armstrong
{
	int check_armstrong(int num) // Method to check number is armstrong or not.
	{
		int temp = num, len = 0;
		while(temp > 0) // While loop to calculate the lenght of the number.
		{
			len++;
			temp = temp/10;
		}
		
		int armstrong = 0;
		while(num > 0) // While loop to generate the resultent number 
		{
			int result = 1;
			temp = num%10;
			for(int i = 0; i < len; i++)
			{
				result = result * temp;
			}
			armstrong = armstrong + result;
			num = num/10;			
		}
		
		return armstrong;
		
	}
	
	public static void main(String args[]) // Main method 
	{
		System.out.println("Enter a number: ");
		
		Scanner sc = new Scanner(System.in); // Created scanner class object for taking input
		int num = sc.nextInt(); // Taking input from user using scanner class object.
		
		Armstrong a = new Armstrong(); // Created object of a class for calling non-static methods.
		
		int result = a.check_armstrong(num); // Passed input number to check whether it is armstrong or not.
		
		if(result == num)
		{
			System.out.printf("The given number %d is an Armstrong Number.", num);
		}
		else
		{
			System.out.printf("The given number %d is Not an Armstrong Number.", num);
		}
		
	}
}