package com.studypedia;

public class JavaMath {
	public  int Y=10;
	public static void main(String[] args) {
	  
		//To find max highest value
		System.out.println(Math.max(25, 70));
		//To find min lowest value
		System.out.println(Math.min(25, 70));
		//To return sqrt value
		System.out.println(Math.sqrt(100));
		// To get absolute positive value
		System.out.println(Math.abs(-4.85));
		//To get random number between 0.0 to 1.0
		System.out.println(Math.random());
		//To get random number between 0 to 100
		int randomNum=(int)(Math.random()*101);
		System.out.println(randomNum);
	}

}
