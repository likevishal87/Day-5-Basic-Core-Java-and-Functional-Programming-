package com.bridgelabz.day5;

import java.util.Scanner;

public class QuotientandRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = num % 10;
		int quo = num / 10;
		System.out.println(rem + " " + quo);
	}
}
