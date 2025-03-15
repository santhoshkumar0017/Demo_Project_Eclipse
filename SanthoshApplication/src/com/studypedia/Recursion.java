package com.studypedia;

public class Recursion {

	public static void myMethod(int k)
	{
		if(k>0)
		{
			System.out.println(k);//call phase
			myMethod(k-1);//recursion call method
		}
		
	}
	public static void myMethod2(int k)
	{
		if(k>0)
		{
			myMethod(k-1);//recursion call method
			System.out.println(k);//return phase
		}
		
	}
	public static void main(String[] args) {
	
          myMethod(5);//call phase example
          myMethod2(5);//return phase example
	}

}
