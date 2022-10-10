package com.bridgelabz.day5;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		double value = 0, number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Nth Number");
		int count = sc.nextInt();
		for (double i = 1; i <= count; i++) {
			number = number + (1 / i);
			value = number;
		}
		System.out.println("The value of harmonic no. " + count + " is: " + value);

	}

}
