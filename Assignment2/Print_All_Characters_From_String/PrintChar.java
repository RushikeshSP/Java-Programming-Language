/*

Que : 4. Write a java program to accept one string from user and print all characters from string. (Using BufferedReader class). charAt(i)
Owner: Rushikesh Sanjay Pokharkar
Batch: PPA9

*/

//                              *********** Solution ************

import java.io.InputStreamReader; // Import necessary classes required.
import java.io.BufferedReader;


class PrintCharacters
{
	void print_characters(String str) // Method to print All characters of string.
	{
		System.out.println("All Characters From above String are: ");
		for(int i = 0; i < str.length() ; i++)
		{
			System.out.println(str.charAt(i));
		}
	}
	
	public static void main(String args[]) throws Exception // Main method 
	{
		
		System.out.println("Enter a String: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Created object of class BufferedReader
		
		String str = br.readLine(); // Taking input using BufferedReader object.
		
		PrintCharacters p = new PrintCharacters(); // Created object of class to call the non-static methods.
		
		p.print_characters(str);
	}
}