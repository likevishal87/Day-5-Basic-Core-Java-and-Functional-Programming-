package com.bridgelabz.day5;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		int xCoordinate = 0;
		int yCoordinate = 0;
		double distance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Distance from Origin Program ");
		System.out.print("Enter the abscissa (x-coordinate) : ");
		xCoordinate = sc.nextInt();
		System.out.print("Enter the ordinate (y-coordinate) : ");
		yCoordinate = sc.nextInt();
		
		distance = Math.sqrt(Math.pow(xCoordinate, 2)+Math.pow(yCoordinate, 2));
		System.out.print("\nDistance of the point ("+xCoordinate+", "+yCoordinate+") from Origin is : ");
		System.out.printf("%.2f units", distance);
	}

}
