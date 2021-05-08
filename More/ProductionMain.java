//Garrett Poppe
//CSUDH
//Inheritance Lab

import java.util.*;
public class ProductionMain
{
	public static void main(String[] args)
	{
//		Production bob = new Production(); // Will not work with abstract class
		
		String director = "augusto";
		Film shrek = new Film();
		Play shrek2 = new Play("shrek2",director,"oscar", 1);
		shrek2.display();
		
		Play play1 = new Musical("play1","play1","play1",1,"play1","play1");
		play1.display();
		
		Play play2;
		Musical musical2 = new Musical("play2","play2","play2",2,"play2","play2");
		play2 = musical2;
		play2.display();
		
		Production p = new Film();
		Production q = new Play();
		Production r = new Musical();
		
// The opposite will not work unless you downcast
/*		
		Play play3 = new Play();
		Musical musical3 = play3; //every play is not a musical need to downcast
*/		
		
// Downcasting
/*
		Play play4 = new Musical("play4","play4","play4",4,"play4","play4");
		Musical musical4 = (Musical)play4; 
		musical4.display();
		
		Play play5 = new Musical("play5","play5","play5",5,"play5","play5");
		String name = play5.getComposer(); // play is a play reference so no composer
		
		Play play6 = new Musical("play6","play6","play6",6,"play6","play6");
		String name1 = ((Musical)play6).getComposer(); // play is downcast
		
		
// Using arrays

			Production productions[] = new Production[3];
			productions[0] = new Film("film","film","film",1);
			productions[1] = new Play("play","play","play",2);
			productions[2] = new Musical("Musical","Musical","Musical",6,"Musical","Musical");
			
			productions[0].getBoxOfficeGross();//problem?
			productions[2].getComposer();//problem?
*/			
			
	}
}