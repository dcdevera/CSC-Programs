/**
*This program converts the 53 days, 12 hours and 39 seconds, to the number of seconds
*that have elapsed since the operating system was last started.
*
*Author: <swag>
*Date: <today>
*
**/
public class Uptime
{
 public static void main(String [] args)
{
	System.out.print("53 days, 12 hours and 39 seconds= ");
	//24 hours in a day, 60 minutes in an hour, 60 seconds in a minute, so:
	//seconds = days * 24 * 60 * 60
	//seconds = hours * 60 * 60
	System.out.print((53*24*60*60) + (12*60*60) + (39) );
	System.out.print("seconds");
}
}