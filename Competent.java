/**
*This program converts the 4,350,000 to the number of minutes, hours and days
*that have elapsed since the operating system was last started.
*
*Author: <swag>
*Date: <today>
*
**/
public class Competent
{
 public static void main(String [] args)
{
	System.out.print("Java competency takes ");
	//24 hours in a day, 60 minutes in an hour, 60 seconds in a minute, so:
	//seconds = seconds/60/60/24
	System.out.print((4350000/60) + " minutes " );
	System.out.print((4350000/60/60) + " hours ");
	System.out.print((4350000/60/60/24) + " days.");
}
}