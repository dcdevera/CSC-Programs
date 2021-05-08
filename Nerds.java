/**
*This program figures out when Silly Sammy studies
*that have elapsed since the operating system was last started.
*
*Author: <swag>
*Date: <today>
*
**/
public class Nerds
{
 public static void main(String [] args)
{
	System.out.print("Silly Sammy studies on days ");
	//Selma t except Sunday
	//Stuart t except Saturday
	//Selma doesn't study Sundays while Stuart doesn't study saturdays
	System.out.println("Monday = " + ((true && true) || (!true && !true)));
	System.out.println("Tuesday = " + ((true && true) || (!true && !true)));
	System.out.println("Wednesday = " + ((true && true) || (!true && !true)));
	System.out.println("Thursday = " + ((true && true) || (!true && !true)));
	System.out.println("Friday = " + ((true && true) || (!true && !true)));
	System.out.println("Saturday = " + ((false && true) || (!false && !true)));
	System.out.println("Sunday = " + ((true && false) || (!true && !false)));
}
}