/* Temperature converter from Celsius to Fahrenheit
*
* Author: <your name>
* Date: <today>
*/
import java.util.*;
public class TemperatureConverterInt
{
public static void main (String[] args)
{
int celsius; // variable to be assigned degree Celsius
int fahrenheit; // variable to be found degree Fahrenheit
Scanner input = new Scanner(System.in); // input
System.out.println("Enter the degree in Celsius:"); // type in Celsius
celsius = input.nextInt(); // data format transformation
fahrenheit = 9*celsius/5 + 32; // convert to Fahrenheit
System.out.println("The temperature degree in Fahrenheit is: "
+ fahrenheit + "F"); // output
}
}