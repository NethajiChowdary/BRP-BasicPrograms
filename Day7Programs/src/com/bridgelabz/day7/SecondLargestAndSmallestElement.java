package com.bridgelabz.day7;

import java.util.Scanner;

public class SecondLargestAndSmallestElement
{

	public static void main(String[] args)
	{
		int temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of an Array: ");
		int n = scanner.nextInt();
		int array[] = new int[n];
		 System.out.println("Enter the Elements in an Array: ");
		 for (int i = 0; i < n; i++)
		 {
			 array[i] = scanner.nextInt();
		 }
		 scanner.close();
		 for(int i = 0; i < n; i++)
		 {
			 for (int j =1; j < n; j++)
			 {
				 if (array[i] > array[j])
				 {
					 temp = array[i];
					 array[i] = array[j];
					 array[j] = temp;
				 }
			 }
		 }
		 System.out.println("Second Largest Number : " +array[2]);
		 System.out.println("Second Smallest Number : " +array[n-1]);
	} 

}
