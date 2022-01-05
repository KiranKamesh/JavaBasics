package com.training.practisework;

public class ReadFromFrontAndBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 55, 555, 555, 55, 5 };
		boolean same = true;
		int j = a.length - 1;

		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] != a[j]) {
				same = false;
				break;
			} else
				j--;
		}
		System.out.println(same);

	}

}
