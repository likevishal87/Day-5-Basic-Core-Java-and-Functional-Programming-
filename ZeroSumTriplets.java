package com.bridgelabz.day5;

import java.util.Scanner;

public class ZeroSumTriplets {

	public static void main(String[] args) {
		int array[] = null;
		int length = 0;
		int triplets = 0;

		System.out.println("Welcome to the Zero Sum Integers Program!");
		System.out.println("This program finds distinct integer triplets whose sum is zero.");
		System.out.print("\nEnter the number of the integers: ");

		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		array = new int[length];

		System.out.println("Enter the integers...");
		for (int i = 0; i < length; i++) {
			System.out.print("Enter Integer " + (i + 1) + " : ");
			array[i] = sc.nextInt();
		}

		System.out.println();
		for (int i = 0; i < length - 2; i++)
			for (int j = i + 1; j < length - 1; j++)
				for (int k = j + 1; k < length; k++)
					if ((array[i] + array[j] + array[k]) == 0) {
						triplets++;
						System.out.println(array[i] + " + " + array[j] + " + " + array[k] + " = 0");
					}

		if (triplets == 0)
			System.out.println("\nNo Zero Sum combination integer triplets exist in the given input.");
		else
			System.out.println("\n" + triplets + " Zero Sum combination integer triplets exist in the given input.");

	}

}
