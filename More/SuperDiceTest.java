/* A tester class for SuperDice and SuperDie. */


public class SuperDiceTest {
	public static void main(String[]args) {			
		SuperDice d1 = new SuperDice(); // Default constructor.
		SuperDice d2 = new SuperDice(10); // Ten 10-sided dice.
		SuperDice d3 = new SuperDice(3,5); // Three 5-sided dice.

		System.out.println(d1.getNumDice()); // 1.
		System.out.println(d2.getNumDice()); // 8.
		System.out.println(d3.getNumDice()); // 3.
 
		System.out.println(d1.getNumSides(0)); // 6.
		System.out.println(d2.getNumSides(5)); // 9.
		System.out.println(d3.getNumSides(4)); // -1 invalid range.

		System.out.println(d1.roll()); // 1-6
		System.out.println(d2.roll()); // 8-53 
		System.out.println(d3.roll()); // 3-15 

		d2.setSides(5,20);                     
	    System.out.println(d2.getNumSides(5)); // 20.
	}
}