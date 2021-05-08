/*
Darren De Vera
CSC 123 Thursday Lab
Fall 2016
Lab #6 | PublicationTest
ID# 203813701
*/

import java.util.*;

public class PublicationTest
{
	public static void main(String[] args)
	{
		Publication[] list;
		list = new Publication[10];
		
		Magazine GameInformer = new Magazine(50, 1.67,"GameStop","Game Informer", "Monthly");
		list[0] = GameInformer;
		list[0].print();
		
		System.out.println(" "); //just to space the list better
		
		Magazine TimeMagazine = new Magazine(40, 16.00, "Time", "Time Magazine", "Yearly");
		list[1] = TimeMagazine;
		list[1].print();
		
		System.out.println(" ");
		
		Magazine NintendoPower = new Magazine(30, 10, "Nintendo", "Nintendo Power", "Monthly");
		list[2] = NintendoPower;
		list[2].print();
		
		System.out.println(" ");
		
		Book LAWKI = new Book(337, 12.59, "Harcourt Children's Books", "Life as We Knew It", "Susan Beth Pfeffer");
		list[3] = LAWKI;
		list[3].print();
		
		System.out.println(" ");
		
		Book Mockingbird = new Book(281, 14.99, "Harper Lee", "To Kill a Mockingbird", "Harper Lee");
		list[4] = Mockingbird;
		list[4].print();
		
		System.out.println(" ");
		
		Book NGNL = new Book(176, 14.99, "Yen Press", "No Game No Life", "Yuu Kamiya");
		list[5] = NGNL;
		list[5].print();
		
		System.out.println(" ");
		
		KidsMagazine Zoobooks = new KidsMagazine(30, 5.99, "Wildlife Education, Ltd", "Zoobooks", "Monthly", 8);
		list[6] = Zoobooks;
		list[6].print();
		
		System.out.println(" ");
		
		KidsMagazine JrBaseball = new KidsMagazine(35, 19.99, "Jsan Publishing, Llc", "Junior Baseball", "Weekly", 13);
		list[7] = JrBaseball;
		list[7].print();
		
		System.out.println(" ");
		
		KidsMagazine BoysLife = new KidsMagazine(25, 24, "Boy Scouts of America", "Boys' Life", "Monthly", 12);
		list[8] = BoysLife;
		list[8].print();
		
		System.out.println(" ");
		
		Publication Something = new Publication(100, 19.99, "Me", "Some book");
		list[9] = Something;
		list[9].print();
		
	}
}