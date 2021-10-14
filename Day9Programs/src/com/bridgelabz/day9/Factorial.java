package com.bridgelabz.day9;

import java.util.Scanner;

public class Factorial
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = scanner.nextInt();
		scanner.close();
		MathFunction.isFactorial(num);
	}

}
