package com.bridgelabz.day1;

import java.util.Scanner;

public class Quadratic 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thre input value a,b,c for Quadratic Calculation:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double delta = b * b - 4 * a * c;
		double sqroot = Math.sqrt(delta);
		double root1 = (-b + sqroot / 2 * a);
		System.out.println("Root1 Output::" + root1);
		double root2 = (-b - sqroot / 2 * a);
		System.out.println("Root2 Output::" + root2);
		sc.close();
	}
}