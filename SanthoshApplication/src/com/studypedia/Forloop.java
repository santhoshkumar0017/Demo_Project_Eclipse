package com.studypedia;

public class Forloop {

	public static void main(String[] args) {
	
		// For loop
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		// Nested For loop
		for(int i=1;i<=2;i++) {//Inner 
			System.out.println("Outer"+i);
			for(int j=1;j<=3;j++) {//Outer
				System.out.println("Inner"+j);
			}
		}
		//For each loop
        String[] cars= { "Volvo", "BMW" ,"Benz" , "Jaguar" };
        for(String i:cars)
        {
        	System.out.println(i);
        }
	}

}
