/*
Darren De Vera
CSC 123 Thursday Lab
Fall 2016
Lab #6 | KidsMagazine
ID# 203813701
*/

import java.util.*;

public class KidsMagazine extends Magazine
{
	protected int age;
	
	public KidsMagazine()
	{
		super();
		age = 0;
	}
	public KidsMagazine(int x, double y, String p, String t, String u, int z)
	{
		super(x,y,p,t,u);
		age = z;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int z)
	{
		age = z;
	}
	public void print()
	{
		System.out.println("Title: " + title);
		System.out.println("Publisher: " + publisher);
		System.out.println("Number of pages: " + pageNum);
		System.out.println("Price: $" + price);
		System.out.println("Publication Unit: " + publicationUnit);
		System.out.println("Recommended age: " + age);
	}
}