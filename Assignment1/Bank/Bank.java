import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Console;


class Account
{
	String name;
	String address;
	long ac_no;
	int amount;

	void open_account()
	{
		Scanner details = new Scanner(System.in);
		
		System.out.println("Please Enter Your Name: ");
		name = details.nextLine();
		System.out.println("Please Enter Your Address: ");
		address = details.nextLine();
		System.out.println("Please Enter Your A/C Number: ");
		ac_no = details.nextLong();
		System.out.println("Please Enter Your Amount to be deposited: ");
		amount = details.nextInt();
		
		System.out.printf("%s Your Account Created Successfully..\n\n", name);
	}
	void display_account()
	{
		System.out.println("****** A/C Holder Details ******\n");
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Account No: "+ac_no);
		System.out.println("Current A/C Balence: "+amount+"\n");
	}
	
	void deposit_money()
	{
		System.out.println("Enter Amount to be deposited: ");
		
		Console c = System.console();
		char ch[] = c.readPassword();
		
		String pass = String.valueOf(ch);

		amount = amount + Integer.parseInt(pass);
		System.out.printf("Amount deposited Successfully... \nYour Current A/C Balence Is: %d\n", amount);
		
	}
	
	void withdraw_money()
	{
		System.out.println("Enter Amount to be Withdraw: ");
		
		Console c = System.console();
		char ch[] = c.readPassword();
		
		String pass = String.valueOf(ch);
		
		int temp = Integer.parseInt(pass);
		
		if(temp>=amount)
		{
			System.out.println("Insufficient Bank Balence...Please Try Entering Lesser Amount.");
		}
		else
		{
			amount = amount - temp;
			System.out.printf("Amount Withdraw Successfully... \nYour Current A/C Balence Is: %d\n", amount);
		}
	}
	
	/*
	void withdraw_money() throws Exception
	{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		
		System.out.println("Enter Amout to be withdrawed: ");
		
		int temp = Integer.parseInt(br.readLine());
		amount = amount - temp;
		
		System.out.printf("Amount withdrawed Successfully... Your current balence is: %d\n", amount);
		
	}*/
	
	
	public static void main(String args[])
	{
		System.out.println("..... Welcome .....");
		
		Account Rushi = new Account();
		
		String ch;
		int choice = 1;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Please Enter Your choice: ");
			System.out.println("1. For Open Account");
			System.out.println("2. For Display Account");
			System.out.println("3. For Deposite Money");
			System.out.println("4. For Withdraw Money");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					Rushi.open_account();
					break;
				case 2:
					Rushi.display_account();
					break;
				case 3:
					Rushi.deposit_money();
					break;
				case 4:
					Rushi.withdraw_money();
					break;
				default:
					System.out.println("Please Enter a Valide Choice: ");
					break;
			}
		
			System.out.println("Do You Want to Continue(y or n): ");
			ch = sc.next();
		}while(ch.charAt(0) == 'y');
	}
}
