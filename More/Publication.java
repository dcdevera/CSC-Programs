/*
Darren De Vera
CSC 123 Thursday Lab
Fall 2016
Lab #6 | Publishing
ID# 203813701
*/

import java.util.*;

public class Publication
{
	protected String publisher;
	protected int pageNum;
	protected double price;
	protected String title;
	
	public Publication()
	{
		publisher = " ";
		pageNum = 0;
		price = 0;
		title = " ";
	}
	public Publication(int x, double y, String p, String t)
	{
		publisher = p;
		pageNum = x;
		price = y;
		title = t;
	}
	public String getPublisher()
	{
		return publisher;
	}
	public void setPublisher(String p)
	{
		publisher = p;
	}
	public int getPage()
	{
		return pageNum;
	}
	public void setPage(int x)
	{
		pageNum = x;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double y)
	{
		price = y;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String t)
	{
		title = t;
	}
	public void print()
	{
		System.out.println("Title: " + title);
		System.out.println("Publisher: " + publisher);
		System.out.println("Number of pages: " + pageNum);
		System.out.println("Price: $" + price);
	}
}