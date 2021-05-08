/*
Darren De Vera
CSC 123 Thursday Lab
Fall 2016
Lab #5 | Employee
ID# 203813701
*/

import java.util.*;

public class Employee
{
	protected String name;
	protected int Id;
	protected int age;
	protected int salary;
	protected int salary1;
	protected double salary2;
	protected String title;
	protected String department;
	
	public Employee()
	{
		name = "";
		Id = 0;
		age = 0;
		salary = 0;
		title = "";
		department = "";
	}
	public Employee(String n, int id, int a, int s, String t, String d)
	{
		name = n;
		Id = id;
		age = a;
		salary = s;
		title = t;
		department = d;
	}
	public void printRecord()
	{
		System.out.println("\n-------------------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("ID: " + Id);
		System.out.println("Salary: " + salary);
		System.out.println("Title: " + title);
		System.out.println("Department: " + department);
		System.out.println("-------------------\n");
	}
	
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return Id;
	}
	public int getAge()
	{
		return age;
	}
	public int getSalary()
	{
		return salary;
	}
	public String getTitle()
	{
		return title;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setID(int id)
	{
		Id = id;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public void setSalary(int s)
	{
		salary = s;
	}
	public void setTitle(String t)
	{
		title = t;
	}
	public void setDepartment(String d)
	{
		department = d;
	}
	public void changeSalary(int increase)
	{
		salary1 = salary + increase;
	}
	public void changeSalary(double increase)
	{
		salary2 = salary * (increase + 1.0);
	}
	public double getNewSalary()
	{
		return salary2;
	}
}