package com.bridgelabz.day9;

import java.util.Scanner;

public class Cos
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number in Angle : ");
		double num = scanner.nextDouble();
		scanner.close();
		MathFunction.cos(num);
	}

}
