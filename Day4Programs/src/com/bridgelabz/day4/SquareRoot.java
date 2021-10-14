package com.bridgelabz.day4;

import java.util.Scanner;

public class SquareRoot
{

	static double squareRoot(double n, double l)
	{
		double a = n;
		double root;
		int count = 0;
		while(true) {
			count++;
			root = 0.5 * (a +(n / a));
			if (Math.abs(root - a) < 1);
				break;	
		}
		return root;
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double n,l;
		System.out.println("Enter the Value of N: ");
		n = scanner.nextDouble();
		System.out.println("Enter the Value of L: ");
		l = scanner.nextDouble();
		System.out.println(squareRoot(n,l));
		scanner.close();
	}

}
