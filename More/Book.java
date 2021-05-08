/*
Darren De Vera
CSC 123 Thursday Lab
Fall 2016
Lab #6 | Book
ID# 203813701
*/

import java.util.*;

public class Book extends Publication
{
	protected String author;
	
	public Book()
	{
		super();
		author = " ";
	}
	public Book(int x, double y, String p, String t, String a)
	{
		super(x,y,p,t);
		author = a;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String a)
	{
		author = a;
	}
	public void print()
	{
		System.out.println("Title: " + title);
		System.out.println("Publisher: " + publisher);
		System.out.println("Author: " + author);
		System.out.println("Number of pages: " + pageNum);
		System.out.println("Price: $" + price);
	}
}