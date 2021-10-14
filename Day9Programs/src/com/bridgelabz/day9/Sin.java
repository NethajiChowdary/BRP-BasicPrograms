package com.bridgelabz.day9;

import java.util.Scanner;

public class Sin 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number in Angle: ");
		double num = scanner.nextDouble();
		scanner.close();
		MathFunction.sin(num);
		
	}

}
