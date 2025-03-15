package com.studypedia;

public class DemoBubbleSort { 
	public static void main(String[] args) {
		int num[]= {7,8,9,4,5,6,1,2,3,0};
		int temp;
		System.out.println("Before Sorting");
		for(int nums:num) {
			System.out.print(nums+" ");
		}
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<num.length-i-1;j++) {
				
				if(num[j]>num[j+1]) {
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int nums:num) {
			System.out.print(nums+" ");
		}
		
	}
}
