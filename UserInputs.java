package com.training.practisework;

import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {
		int[] arr = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 20 values");
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Number of positive number: ");
		int count = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>0) {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("Number of negative numbers");
		int countNegative = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]<0) {
				countNegative++;
			}
		}
		System.out.println(countNegative);
		
		System.out.println("Number of odd numbers");
		int countOdd = 0;
		for(int i =0; i<arr.length;i++) {
			if(arr[i]%2!=0) {
				countOdd++;
			}
		}
		System.out.println(countOdd);
		
		
		System.out.println("Number of even numbers");
		int countEven = 0;
		for(int i =0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				countEven++;
			}
		}
		System.out.println(countEven);
		
		System.out.println("Number of zeros");
		int countZero = 0;
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==0) {
				countZero++;
			}
		}
		System.out.println(countZero);


	}

}
