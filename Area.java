//Has to accept 5 values and print average
//cannot use 5 different variables
import java.util.*; //to use Scanner
public class Area
{
public static void main (String [] args)
{
	double length, width, height;
	Scanner input = new Scanner (System.in);
System.out.println("Enter length ");
length = input.nextInt();
System.out.println("Enter width ");
width = input.nextInt();
System.out.println("Enter height ");
height = input.nextInt();
System.out.println("Area is " + length*width*height);
}
}