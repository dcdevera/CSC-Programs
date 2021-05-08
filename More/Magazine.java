/*
Darren De Vera
CSC 123 Thursday Lab
Fall 2016
Lab #6 | Magazine
ID# 203813701
*/

import java.util.*;

public class Magazine extends Publication
{
	protected String publicationUnit;
	
	public Magazine()
	{
		super();
		publicationUnit = " ";
	}
	public Magazine(int x, double y, String p, String t, String u)
	{
		super(x,y,p,t);
		publicationUnit = u;
	}
	public String getUnit()
	{
		return publicationUnit;
	}
	public void setUnit(String u)
	{
		publicationUnit = u;
	}
	public void print()
	{
		System.out.println("Title: " + title);
		System.out.println("Publisher: " + publisher);
		System.out.println("Number of pages: " + pageNum);
		System.out.println("Price: $" + price);
		System.out.println("Publication Unit: " + publicationUnit);
	}
}