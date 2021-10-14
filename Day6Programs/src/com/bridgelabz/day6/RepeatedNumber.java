package com.bridgelabz.day6;

import java.util.Scanner;

public class RepeatedNumber
{
	static void printRepeated(int array[], int n)
	{
		for(int i =0 ; i < n-1; i++)
		{
			for( int j =i+1; j < n; j++)
			{
				if ( array[i] == array[j])
					System.out.println(array[j]);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of an Array: ");
		int size = scanner.nextInt();
		int [] array = new int[size];
		int n = array.length;
		System.out.println("Enter the Elements of Array: ");
		for(int i = 0; i < size; i++)
		{
			array[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("Repeated Elements are : ");
		printRepeated(array, n);

	}

}
