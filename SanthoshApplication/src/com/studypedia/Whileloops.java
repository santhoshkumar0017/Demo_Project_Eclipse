package com.studypedia;

public class Whileloops {

	public static void main(String[] args) {
		
		int dice=1;
		
		while(dice<=6)
		{
		/*  if(dice==6)
		   {
			  System.out.println("Yatzy");
		   }
		  else 
		  {
			  System.out.println("No Yatzy");
		  }*/
		  String result=(dice==6)?"Yatzy":"No Yatzy"; //ternary operator handy short cut if else condition
		  System.out.println(result);
		  dice++;
		}
		
		
		
		//do while loop condition
		int count=5;
		do {
			System.out.println(count);
			count++;
		}
		while(count <5);
		
	}

}
