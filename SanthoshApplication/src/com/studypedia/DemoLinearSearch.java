package com.studypedia;

public class DemoLinearSearch {
   public static int linearSearch(int[] number,int target) {
	   for(int i=0;i<number.length;i++) {
		   if(number[i]==target) {
			   return i;
		   }
	   }
	   return-1;
   }
   public static void main(String[] args) {
	int[] numbers= {10,20,30,40,50};
	int target=30;
	int result=linearSearch(numbers, target);
	if(result!=-1) {
		System.out.println("Number is found index: "+result);
	}
	else {
		System.out.println("Number not found");
	}
}
}
