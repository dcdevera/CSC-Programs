/*
Garrett Poppe
CSUDH
csc-123
Test Main
*/

import java.util.*; 

class MainDie {
    public static void main (String[] args) {
        int value, sides;
	    Random rand = new Random();
        	
	    SuperDie d1 = new SuperDie();
	    SuperDie d2 = new SuperDie(20);
	    SuperDie d3 = new SuperDie(10,rand);
	    
	    value = d1.roll();
	    System.out.println ("die1 = " + value);
	    
	    value = d2.roll();
	    System.out.println ("die2 = " + value);
	    
	    value = d3.roll();
	    System.out.println ("die3 = " + value);
	    
	    d1.setNumSides(8);
	    System.out.println ("die1 = " + d1.getNumSides());
    }
}