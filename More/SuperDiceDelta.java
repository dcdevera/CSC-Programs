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
	
		private SuperDice[] dice; //array of SuperDie objects
		private int numDice; //the amount of dice in the collection
	
	public SuperDice() 
	{
		dice = new SuperDie[1];
		dice[0] = new SuperDie();
	}
	
	public SuperDice(int value[])
	{
		dice = new SuperDie[value.length];
		for (int i = 0; i <value.length; i++)
		{
			dice[i] = new SuperDie(value[i]);
		}
	}
	
	public SuperDice(int number, int sides)
	{
		if (number > 0 && sides > 0)
		{
			dice = new SuperDie[number];
			for (int i = 0; i < number; i++)
			{
				dice[i] = new SuperDie(sides);
			}
		}
	}
	public int roll(){
		int rollVal = 0;
		for (int i = 0; i < dice.length; i++){
			rollVal += dice[i].roll();
		}
		return rollVal;
	}
	public int getNumSides(int d){
		int numSide;
		if (d >= 0 && d <= dice.length){
			numSide = dice[d].getNumSides();
		}
		else{
			numSide = 0;
		}
		return numSide;
	}
	public void setSides(int side2, int x)
	{
		if (side2 >= 0 && d <= dice.length)
		{
			dice[side2] = new SuperDie(x);
		}
	}
}