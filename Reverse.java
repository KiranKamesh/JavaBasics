package com.training.practisework;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		int reverse = 0;
		
		while(num!=0) {
			int rem = num %10;	
			reverse = (reverse*10) + rem;
			num = num/10;
		}
			System.out.println("Reverse is: "+reverse);

	}

}
