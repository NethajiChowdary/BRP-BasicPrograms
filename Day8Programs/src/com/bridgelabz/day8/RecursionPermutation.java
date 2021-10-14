package com.bridgelabz.day8;

import java.util.Scanner;

public class RecursionPermutation
{
	private static void swap(char[] ch, int i , int j) 
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
	private static void printPermutations(char[] ch, int currentIndex)
	{
		if(currentIndex == ch.length -1)
		{
			System.out.println(String.valueOf(ch));
		}
		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			printPermutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string = scanner.nextLine();
		printPermutations(string.toCharArray(), 0);
		scanner.close();
	}

}
