/*
Garrett Poppe
CSUDH
CSC-123
Objects and classes lab
*/


import java.util.*; 

public class CircleA
{
	double radius = 1.0;
	
	public CircleA()
	{
		radius = 1.0;
	}
	
	public CircleA(double r)
	{
		radius =r;
	}
	
	double findArea()
	{
		return radius * radius * 3.14159;
	}
	
	
}