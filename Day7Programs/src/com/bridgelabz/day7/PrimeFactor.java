package com.bridgelabz.day7;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = scanner.nextInt();
		scanner.close();
		for (int i = 2; i < number; i++)
		{
			while(number%i ==0)
			{
				System.out.println(i+" ");
				number = number/i;
			}
		}
		if(number > 2)
		{
			System.out.println(number);
		}
 }

}
