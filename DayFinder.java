//Displays the number of the day (1-7) on which February 2, 2016 occured.
public class DayFinder
{
	public static void main(String[] args)
{
	System.out.print ("February 2, 2016 fell on the day number ");
	//Uses the Zeller formula
	System.out.println( ((2+ (2*((2+9)%12+1)-1)/5 // day = 2, month = 2
				+2016%100 // year = 2016
				+2016%100/4
				+2016/400
				-2*(2016/100))%7+7)%7 +1);
}
}