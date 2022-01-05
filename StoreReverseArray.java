package com.training.practisework;

import java.util.Arrays;
import java.util.Scanner;

public class StoreReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("arr is: "+Arrays.toString(arr));
		
		int brr[] = new int[arr.length];
		for(int i = brr.length-1;i>=0;i--) {
			brr[i] = arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(brr));

	}

}
