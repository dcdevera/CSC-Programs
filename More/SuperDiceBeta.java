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
	private int numDieSides;
	private Random rand;
	
	int numDice;
	SuperDie[] dice;
	
	
	
	public SuperDice()
	{
		setSides(6);
		rand = new Random();
	}
	public SuperDice(int n)
	{
		if(n < 1)
		{
			System.out.println("Dice sides must be greater than 0.");
		}
		setSides(n);
	}
	public SuperDice(int n, Random r)
	{
		setSides(n);
		rand = r;
		
	}
	public int roll()
	{
		Random rand = new Random();
		int sum = 0;
		sum = rand.nextInt(numDieSides)+1;
		return sum;
	}
	public int getNumSides(int i)
	{
		return numDieSides;
	}
	public void setSides(int n)
	{
		numDieSides = n;
	}
	public int getNumDice()
	{
		return numDice;
	}	
}