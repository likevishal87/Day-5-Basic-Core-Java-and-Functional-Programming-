package com.bridgelabz.day5;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println();
		int value = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(value);
	}

}
