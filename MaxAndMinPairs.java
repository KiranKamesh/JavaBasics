package com.training.practisework;

public class MaxAndMinPairs {

	public static void main(String[] args) {
		int[] arr = {10,22,32,11,44};
		int maxDiff = arr[1] - arr[0];
		int i,j;
		for(i =0 ; i<=arr.length;i++) {
			for(j = i+1; j<arr.length;j++) {
				if(arr[j]-arr[i]>maxDiff) {
					maxDiff = arr[j] - arr[i];
				}
			}
		}
		System.out.println("Max_difference is: "+maxDiff);
		
	


	}

}
