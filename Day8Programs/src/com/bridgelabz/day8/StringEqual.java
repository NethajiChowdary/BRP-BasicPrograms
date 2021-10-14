package com.bridgelabz.day8;

import java.util.Arrays;
import java.util.Scanner;

public class StringEqual
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String arr1 = scanner.nextLine();
		Object[] array1 = {arr1};
		System.out.println("Enter the Second String : ");
		String arr2 = scanner.nextLine();
		Object[] array2 = {arr2};
		scanner.close();
		
		if (Arrays.deepEquals(array1, array2))
			System.out.println("Arrays are Equal.");
		else
			System.out.println("Arrays are Not Equal");
	}

}
