package com.studypedia;

public class DemoInsertSorting {

	public static void main(String[] args) {
		int arr[] = {122,48,65,78,36};
		
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			System.out.println();
			for(int ar:arr) {
				System.out.print(ar+" ");
			}
			arr[j+1]=key;
		}
		System.out.println();
		System.out.println("After sorting");
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
	}
	
}
