/*
Darren De Vera
CSC 123 Thursday Lab
Fall 2016
Lab #2 | Grades
ID# 203813701
*/

import java.util.*;

public class Grades
{
	
	public static int[] getGrades()
	{
		Scanner input = new Scanner(System.in);
		int[]studentGrades;
		
		System.out.println("How many grades does the student have?");
		int size = input.nextInt();
		studentGrades = new int[size];
		System.out.println("Please give the student's grades. Grades are 1-10.");
		int sum = 0;
		for(int i = 0; i < size; i++)
		{
			studentGrades[i] = input.nextInt();
			sum = sum + studentGrades[i];
		}
		return studentGrades;
	}
	public static void main(String[] args)
	{
		int[] grades;
		grades = getGrades();
		System.out.println(grades);
	}
}