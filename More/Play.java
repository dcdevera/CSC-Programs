/*
Garrett Poppe
CSUDH
Inheritance Lab
*/

import java.util.*;

public class Play extends Production
{
	protected int performances;
	
	public Play ()
	{
		super();
		performances = 0;
	}
	
	public Play (String t, String d, String w, int p)
	{
		super(t,d,w);
		performances = p;
	}
	
	public void setPerformaces(int p)
	{
		performances = p;
	}
	
	public int getPerformances()
	{
		return performances;
	}
	
	public void display()
	{
		System.out.println("Title = "+ title);
		System.out.println("Director = "+ director);
		System.out.println("Writer = "+ writer);
		System.out.println("Performances = "+ performances);
	}
	
}