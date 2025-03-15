package com.studypedia;

public class Demo {

public static int waterUnit(int[] arr) {
	int res=0;
	
	for(int i=1;i<arr.length-1;i++) {
		
		int left=arr[i];
		for(int j=0;j<i;j++) {
			left=Math.max(left, arr[j]);
		}
		int right=arr[i];
		for(int k=i+1;k<arr.length;k++) {
			right=Math.max(right, arr[k]);
		}
		res+=Math.min(left, right)-arr[i];
	}
	return res;
}
}
