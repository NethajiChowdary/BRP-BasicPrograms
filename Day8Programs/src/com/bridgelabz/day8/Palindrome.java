package com.bridgelabz.day8;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		String rev = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String string = scanner.nextLine();
		int length = string.length();
		scanner.close();
		for (int i = length -1; i >= 0; i--)
			rev = rev + string.charAt(i);
		if (string.equals(rev))
			System.out.println(string+ " is a Palindrome");
		else
			System.out.println(string+ " is not a Palindrome");
	}

}
