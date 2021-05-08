/*
Darren De Vera
CSC 123 Thursday Lab
Fall 2016
Lab #5 | Manager
ID# 203813701
*/

import java.util.*;

public class Manager extends Employee
{
	protected Employee[] employee;
	
	public Manager()
	{
		super();
	}
	public Manager(int size)
	{
		employee = new Employee[size];
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
	public void addEmployee(Employee e)
	{
		employee[0] = e;
	}
	
}