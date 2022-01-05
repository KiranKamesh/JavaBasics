package com.training.practisework;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		
		int i, fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);

	}

}
