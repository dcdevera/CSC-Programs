/*
Darren De Vera
CSC 123
Fall 2016
Assignment #2 | FilmMusical
ID# 203813701
*/

import java.util.*;

public abstract class DDevera implements Film, Musical
{
	protected int boxOfficeGross;
	String title;
	String director;
	String writer;
	
	public void Film()
	{
		boxOfficeGross = 0;
	
	
	
		String t = title;
		String d = director;
		String w = writer;
		int g = boxOfficeGross;
	}
	
	public int getBoxOfficeGross()
	{
		return boxOfficeGross;
	}
	
	public void setBoxOfficeGross(int g)
	{
		boxOfficeGross = g;
	}

	public void display()
	{
		System.out.println("Title = "+ title);
		System.out.println("Director = "+ director);
		System.out.println("Writer = "+ writer);
		System.out.println("Gross = "+ boxOfficeGross);
		System.out.println("Composer = "+ composer);
		System.out.println("Lyracist = "+ lyracist);
	}
		protected String composer;
	protected String lyracist;
	
	public void Musical()
	{
		
		composer = "";
		lyracist = "";
	}
	
	public void Musical(String t, String d, String w, int p, String c, String l)
	{
		
		composer = c;
		lyracist = l;
	}
	
	public void setComposer(String c)
	{
		composer = c;
	}
	
	public String getComposer()
	{
		return composer;
	}
	
	public void setLyracist(String l)
	{
		lyracist = l;
	}
	
	public String getLyracist()
	{
		return lyracist;
	}
	
}