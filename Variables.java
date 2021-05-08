//Has to accept 5 values and print average
//cannot use 5 different variables
import java.util.*; //to use Scanner
public class Variables
{
public static void main (String [] args)
{
Scanner input = new Scanner (System.in);
System.out.println("Enter value");
int value = input.nextInt();
System.out.println("Print value" + value);
System.out.println("Enter value");
value = value + input.nextInt();
System.out.println("Print value" + value);
System.out.println("Enter value");
value = value + input.nextInt();
System.out.println("Print value" + value);
System.out.println("Enter value");
value = value + input.nextInt();
System.out.println("Print value" + value);
System.out.println("Enter value");
value = value + input.nextInt();
System.out.println("Print value" + value/5);
}
}
