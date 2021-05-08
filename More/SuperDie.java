/*
Darren De Vera
CSC 123 Thursday Lab
Fall 2016
Lab #2 | Super Die
ID# 203813701
*/

import java.util.*;

public class SuperDie
{
	private int numSides;
	private Random random;
	
	public SuperDie()
	{
		setNumSides(6);
		random = new Random();
	}
	public SuperDie(int n)
	{
		setNumSides(n);
		random = new Random();
	}
	public SuperDie(int n, Random r)
	{
		setNumSides(n);
		random = r;
	}
	public int roll()
	{
		return random.nextInt(numSides) + 1;
	}
	public int getNumSides()
	{
		return numSides;
	}
	public void setNumSides(int n)
	{
		numSides = n;
	}
}