/**
*@author Darren De Vera
*CSC 123 Lab Tuesday
*Fall 2016
*Lab #1 | Recursive Factorial
* ID# 203813701
*/

import java.util.*;

public class RecursiveFactorial
{
	public static int fac(int n) //recursive method
	{
		if(n==0)
		{
			return 1; 
		}
		if(n>0)
		{
			return n*fac(n-1);
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Give a number.");
		int n = input.nextInt();
		int x;
		x =fac(n);
		System.out.println(n + "! = " + x);
	}
}