/*
Garrett Poppe
CSUDH
csc-123
Test Main
*/

import java.util.*; 

class MainTesterA {
 public static void main (String[] args) 
 {
	final double TEMPR = 5.0;
	double c1Area;
	double c2Area;
	double c3Area;
	
	Circle c1 = new Circle();
	CircleA c2 = new CircleA(2.0);
	
	c1Area = c1.findArea();
	c2Area = c2.findArea();
	
	
    System.out.println ("Circle1 radius = " + c1.radius + " Area = " + c1Area);
	System.out.println ("Circle2 radius = " + c2.radius + " Area = " + c2Area);
	
	CircleA c3 = new CircleA(TEMPR);
	c3Area = c3.findArea();
	System.out.println ("Another instance of circleA is created with a radius of " + TEMPR);
	
	System.out.println ("Circle1 radius = " + c1.radius + " Area = " + c1Area);
	System.out.println ("Circle2 radius = " + c2.radius + " Area = " + c2Area);
	System.out.println ("Circle3 radius = " + c3.radius + " Area = " + c3Area);
	
	
	
 }
}