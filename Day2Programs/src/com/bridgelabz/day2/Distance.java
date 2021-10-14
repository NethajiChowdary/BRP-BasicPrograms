package com.bridgelabz.day2;

import java.util.Scanner;

public class Distance 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double x , y ,distance;
		System.out.println("Enter the values of x, y: ");
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		scanner.close();
		distance = Math.sqrt(x*x+y*y);
		System.out.println(distance);
	}
}
