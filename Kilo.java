import java.util.Scanner;

public class Kilo
{
	public static void main (String[] args)
	{
		double kilometers, miles; //things to be calculated

		miles = 0.62; //constant
		
		Scanner input = new Scanner(System.in);

		System.out.print ("Enter kilometers ");
		kilometers = input.nextInt();

		System.out.println("Miles equal " + kilometers/miles); //converts kilometers to miles
		System.out.println("Miles equal " + ((int) (kilometers/miles*100)/ 100.0) ); //converts int to double
		
	}
}		