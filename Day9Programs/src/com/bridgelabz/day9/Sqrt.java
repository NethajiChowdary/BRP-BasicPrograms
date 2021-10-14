package com.bridgelabz.day9;

import java.util.Scanner;

public class Sqrt 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		double num = scanner.nextDouble();
		scanner.close();
		MathFunction.isSqrt(num);
	}

}
