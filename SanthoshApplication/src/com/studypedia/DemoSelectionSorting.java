package com.studypedia;

public class DemoSelectionSorting {

	public static void main(String[] args) {
		
		int[] nums= {78,59,32,17,35,65,3};
		int minIndex=-1,temp;
		
		System.out.println("Before Sorting");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		for(int i=0;i<nums.length-1;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
				
				minIndex=i;
				if(nums[minIndex]>nums[j]) {
					minIndex=j;
				}
			}
			temp=nums[minIndex];
			nums[minIndex]=nums[i];
			nums[i]=temp;
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int num:nums) {
			System.out.print(num+" ");
		}
	}
}
