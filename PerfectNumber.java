package com.training.practisework;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=n) {
			if(n%i==0) {
				sum+=i;
			}
			i++;
		}
		if(sum==n) {
			System.out.println("It is a perfect number");
		}else {
			System.out.println("It is not a perfect number");
		}

	}

}
