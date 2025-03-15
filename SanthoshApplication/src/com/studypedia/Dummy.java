package com.studypedia;

import java.util.HashMap;

public class Dummy {

public static int getLongestSubArray(int[] arr,int k)	{
	int n=arr.length;
	HashMap<Integer, Integer> map=new HashMap<>();
	int sum=0;
	int maxLength=0;
	for(int i=0;i<n;i++) {
		sum+=arr[i];
		if(sum==k) {
			maxLength=Math.max(maxLength, i+1);
		}
		int rem=sum-k;
		if(map.containsKey(rem)) {
			int len=i-map.get(rem);
			maxLength=Math.max(maxLength,len);
		}
		if(!map.containsKey(sum)) {
			map.put(sum, i);
		}
	}
	return maxLength;
}
public static void main(String[] args) {
	int[] arr= {94 ,-33,-13 ,40 ,-82, 94 ,-33, -13 ,40 ,-82};
	System.out.println(getLongestSubArray(arr, 52));
}
}
