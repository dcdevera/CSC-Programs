/*
Garrett Poppe
CSUDH
Inheritance Lab
*/

import java.util.*;

public class Production implements Film, Musical
{
	protected String title;
	protected String director;
	protected String writer;
	
	public Production()
	{
		title = "";
		director = "";
		writer = "";
	}
	
	public Production ( String t, String d, String w)
	{
		title = t;
		director = d;
		writer = w;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getDirector()
	{
		return director;
	}
	
	public String getWriter()
	{
		return writer;
	}
	
	public void setTitle(String t)
	{
		title = t;
	}
	
	public void setDirector(String d)
	{
		director = d;
	}
	
	public void setWriter(String w)
	{
		writer = w;
	}
}