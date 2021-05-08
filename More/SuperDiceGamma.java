/*
Darren De Vera
CSC 123 Thursday Lab
Fall 2016
Lab #4 | Super Dice
ID# 203813701
*/

import java.util.*;

public class SuperDice
{
	private int numSides;
	private Random random;
	
	int numDice;
	private SuperDie[] dice;
	
	public void setSides(int i, int sides)
	{
		numDice = i;
		getNumSides(sides);
	}
	public int getNumSides(int i)
	{
		return numSides;
	}
	public int roll()
	{
		int sum = 0;
		for(int i = 0; i < numDice; i++)
		{
			sum += random.nextInt(numSides) + 1;
		}
		return sum;
	}
	public int getNumDice()
	{
		return numDice;
	}
	public SuperDice()
	{
		dice = new SuperDie[1];
		dice[0] = SuperDice();
	}
	public SuperDice(int n)
	{
		getNumSides(n);
	}
	public SuperDice(int p, int q)
	{
		
		getNumSides(q);
	}
}