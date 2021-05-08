//Calculates the price/sq.in. of a round pizza using area = ?r2
//uses the diameter and the price
import java.util.*; //to use Scanner
public class Pizza
{
public static void main (String [] args)
{
double diameter, price; //declare input vaiables
double area, radius, pricePerSquareInch; //declare calculation variables
Scanner input = new Scanner(System.in); //declare a scanner
System.out.print("Enter the diameter of pizza in inches:");
diameter = input.nextDouble(); //use Scanner object, read a double diameter
System.out.print("Enter the price of the pizza:");
price = input.nextDouble(); //use Scanner object, read a double price
radius = diameter/2.0; //calculate radius
area = 3.14159*radius*radius; //area = ?r2
pricePerSquareInch = (price/area*100); //unit price
System.out.println("The price per square inch of a "+diameter+"inch pizza is $"+pricePerSquareInch);
}
}