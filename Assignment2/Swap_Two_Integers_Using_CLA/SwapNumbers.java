/*

Que : 3. Write a java program to swap two integer numbers. (Using Command Line Arguments).
Owner: Rushikesh Sanjay Pokharkar
Batch: PPA9

*/

//                              *********** Solution ************


class SwapTwoNumbers
{
	
	public static void main(String args[]) // Main method 
	{
		int num1 = Integer.parseInt(args[0]); // Assigning first command line input to first number 
		int num2 = Integer.parseInt(args[1]); // Assigning second command line input to second number
		
		System.out.printf("Numbers before swaping are: num1= %d and num2= %d\n", num1, num2);
		
		// Logic to swap two numbers.
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.printf("Numbers after swaping are: num1= %d and num2= %d\n", num1, num2);		
	}
}