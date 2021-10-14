package com.bridgelabz.day5;

import java.util.Scanner;

public class Powerof2
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = scanner.nextInt();
		scanner.close();
		int power =1;
		if(n>=0 && n<31)
		{
			for(int i=1; i<=n; i++)
			{
				power = power * 2;
				System.out.println("PowerOf 2 ^ "  +i+  " is: " +power);
			}
		}
		else 
		{
			System.out.println("Condidtion is Not Satisfied");
		}
	}

}
