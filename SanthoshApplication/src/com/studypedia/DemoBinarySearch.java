package com.studypedia;

public class DemoBinarySearch {
 
	public static int binarySearch(int[] numbers,int target) {
		int left=0;
		int right=numbers.length;
		while(left<=right) {
			
			int middle=left+(right-left)/2;
			if(numbers[middle]==target) {
				return middle;
			}
			if(numbers[middle]>target) {
				right=middle-1;
			}
			else {
				left=middle+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		int target=50;
		int result=binarySearch(numbers, target);
		int result2=recursionBinarySearch(numbers, target,0,numbers.length);
		if(result!=-1) {
			System.out.println("Number is found index: "+result);
		}
		else {
			System.out.println("Number not found");
		}
		if(result2!=-1) {
			System.out.println("Number is found index: "+result);
		}
		else {
			System.out.println("Number not found");
		}
	} 
	
	//Recursion Binary Search
	public static int recursionBinarySearch(int[] nums,int target,int left,int right) {
		
		if(left<=right) {
			
			int mid = (left+right)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]>target) {
				
			return	recursionBinarySearch(nums, target, left, right=mid-1);
			}
			else {
				return	recursionBinarySearch(nums, target, left=mid+1, right);
			}
		}
		return -1;
		
	}
	
}
