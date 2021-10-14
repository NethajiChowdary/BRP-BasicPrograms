package com.bridgelabz.day6;

import java.util.Scanner;

public class PrimeNumberRange
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		System.out.println("Prime Numbers are : " );
		primeNumberRange(n);
		scanner.close();
	}
	static void primeNumberRange(int n)
	{
		int count;
		for (int i = 0; i<=n; i++)
		{
			count = 0;
			for(int j = 1; j <= i; j++)
			{
				if(i%j == 0)
					count = count+1;
			}
			if (count == 2)
				System.out.println(i);
		}
	}
}
