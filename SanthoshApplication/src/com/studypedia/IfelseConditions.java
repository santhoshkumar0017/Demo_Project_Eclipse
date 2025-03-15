package com.studypedia;

public class IfelseConditions {

	public static void main(String[] args) {
		
		
		
		//if else condition
		int password=1098;
		if(password==1098)
		{
			System.out.println("Correct password");
		}
		else 
		{
			System.out.println("Incorrect password");
		}
		
		
		
		//else if condition
		int count=10;
		if(count<10) 
		{
			System.out.println("Count greater than 10");
		}
		else if(count==10) 
		{
			System.out.println("Count equal to 10");
		}
		else
		{
			System.out.println("Count less than 10");
		}
		
		
		
		//To check even or odd number
		int num=9;
		if(num/2==0) 
		{
			System.out.println("It\'s Even Number");
		}
		else
		{
			System.out.println("It\'s Odd Number");
		}
		
		
		
		//Hand short method if else
		int time=12;
		String result=(time<=12)?"Time am": "TIme pm";
		System.out.println(result);
		//Normal if else statement
		
		if(time<=12) 
		{
			System.out.println("\"Time am\"");
		}
		else
		{
			System.out.println("\"Time pm\"");
		}

	}

}
