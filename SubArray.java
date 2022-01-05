package com.training.practisework;

public class SubArray {

	public static void main(String[] args) {
		int[] arr = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		for(int i=0; i<arr.length; i++) {
			if(i>3 && i<8) {
				System.out.print(arr[i]+" ");
			}
		}
		

	}

}
