import java.util.*;

public class Transaction
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);

		int transaction, balance, withdrawal;
		
		System.out.println("What would you like to do?");
		System.out.println("1 -- Withdrawal");
		System.out.println("2 -- Deposit");
		System.out.println("3 -- Check Balance");
		System.out.println("4 -- Exit");
		transaction = input.nextInt();

		switch(transaction)
		{
			case 1: System.out.println("How much would you like to withdraw?");
				balance = input.nextInt();
				int totalBalance;
				withdrawal = totalBalance - balance;
				System.out.println("Withdrew $" + withdrawal);
				System.out.println("Remaining balance: " + totalBalance);
		}
	}
}