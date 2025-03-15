package com.studypedia;

public class DemoMergeSort {
 
	
	public static void main(String[] args) {
		int[]arr= {8,5,6,78,14,25};
		mergeSort(arr, 0, arr.length-1);
		
		for(int num:arr) {
			System.out.print(num + " ");
		}
	}
	public static void mergeSort(int[] arr, int left,int right) {
		
		if(left<right) {
			int mid =(left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
	}
	
	public static void merge(int[] arr,int left , int mid, int right) {
		int arrSize1=mid-left+1;
		int arrSize2=right-mid;
		
		int[] leftArr=new int[arrSize1];
		int[] rightArr=new int[arrSize2];
		
		for(int x=0;x<arrSize1;x++) {
			leftArr[x]=arr[left+x];
		}
		
		for(int x=0;x<arrSize2;x++) {
			rightArr[x]=arr[mid+1+x];
		}
		
		
		int i=0;
		int j=0;
		int k=left;
		
		while(i<arrSize1 && j <arrSize2) {
			
			if(leftArr[i] <= rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
			}
			else{
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		while(i<arrSize1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<arrSize2) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
	
	
 
}
