/*

Que : 6. Write a java program to print all alphabets from ‘A’ to ‘Z’.
Owner: Rushikesh Sanjay Pokharkar
Batch: PPA9

*/

//                              *********** Solution ************



class Alphabets
{
	void print_alphabets() // Method to print all alphabets from A to Z.
	{
		System.out.print("All The Alphabets from A to Z are: ");
		for(int i = 65; i <= 90; i++)
		{
			System.out.printf("%c ", i);
		}
	}
	
	public static void main(String args[]) // Main method 
	{
		Alphabets a = new Alphabets(); // Created object of a class for calling non-static methods.
		
		a.print_alphabets();
	}
}