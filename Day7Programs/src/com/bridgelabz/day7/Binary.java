package com.bridgelabz.day7;

import java.util.Scanner;

public class Binary 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int decimal_number = scanner.nextInt();
		int quotient = decimal_number;
		int i = 1;
		int binary_number[] = new int[100];
		scanner.close();
		while(quotient != 0)
		{
			 binary_number[i++] = quotient % 2; 
			 quotient = quotient / 2;
			 
		}
		System.out.print("Binary Number is: ");
		for (int j = i-1; j > 0; j--)
		{
			System.out.print(binary_number[j]);
		}
	}

}
