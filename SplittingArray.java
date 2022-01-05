package com.training.practisework;

import java.util.Arrays;
import java.util.Scanner;

public class SplittingArray {

	public static void main(String[] args) {

	int[] arr = new int[10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values");
	for(int i = 0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	int n = arr.length;
	
	int[] a = new int[(n+1)/2];
	int[] b = new int[n - a.length];
	
	for(int i = 0; i<n; i++) {
		if(i<a.length) {
		
			a[i] = arr[i];
		}else {
			b[i-a.length] = arr[i];
		}
		
	}
	
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	}

}
