import java.util.*;

public class Pi
{
	public static void main (String[] args)
	{
		double diameter, circumference, area; //declaring things to be calculated
		float radius;
		double pi = 3.14159; //constant
		Scanner input = new Scanner(System.in);

		System.out.println("What is the radius? ");
		radius = input.nextFloat();
		
		diameter = 2*radius; //calculates diameter
		circumference = pi*diameter; //calculates circumference
		area = pi*radius*radius; //Area = pi * r^2

		System.out.println("Diameter = " + diameter);
		System.out.println("Circumference = " + circumference);
		System.out.println("Area = " + area);
	}
}