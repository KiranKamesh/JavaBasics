package com.training.practisework;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		int tem = num;
		int reverse = 0;
		
		while(num!=0) {
			int rem = num %10;	
			reverse = (reverse*10) + rem;
			num = num/10;
		}
		if(tem == reverse) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}

	}

}
