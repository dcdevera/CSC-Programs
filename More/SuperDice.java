/*
Darren De Vera
CSC 123 Thursday Lab
Fall 2016
Lab #4 | Super Dice
ID# 203813701
*/

import java.util.*;
import java.util.Random;

public class SuperDice
{
    private SuperDie[] dice;

        public SuperDice()
    {
        dice = new SuperDie[1];
        dice[0] = new SuperDie();
    }
    public SuperDice(int size)
    {
        dice = new SuperDie[size];
        for(int i = 0; i < size; i++)
        {
            dice[i] = new SuperDie(size);
        }
    }
    public SuperDice(int size, int sides)
    {
        dice =  new SuperDie[size];
        for(int i = 0; i < size; i++)
        {
            dice[i] = new SuperDie(sides);
        }
    }
    public int getNumDice()
    {
        return dice.length;
    }
        public int getNumSides(int x)
    {
        if (dice.length <= x || x < 0)
        {
            return -1;
        }
        else
        {
            return dice[x].getNumSides();
        }
    }
    public int roll()
    {
        int sum = 0;
        for(int i = 0; i < dice.length; i++)
        {
            sum = sum + dice[i].roll();
        }
        return sum;
    }
    public void setSides(int d, int sides)
    {
        dice[d].setNumSides(sides);
    }
}
