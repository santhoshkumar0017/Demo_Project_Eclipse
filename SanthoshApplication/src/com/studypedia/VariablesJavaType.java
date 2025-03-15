package com.studypedia;

public class VariablesJavaType {

	public static void main(String[] args) {
		
		int numberOfItem=50;
		float costOfItem=9.99f;
		float totalCostOfItem=numberOfItem*costOfItem;
		char costSymbol='$';
		
		
       System.out.println("No of Item: "+ numberOfItem);
       System.out.println("Cost of Per Item: "+ costOfItem+costSymbol);
       System.out.println("No of Item: "+ totalCostOfItem+costSymbol);
	}

}
