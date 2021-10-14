package com.bridgelabz.day8;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String s1 = scanner.nextLine();
		System.out.println("Enter the Second String : ");
		String s2 = scanner.nextLine();
		if(checkAnagram(s1,s2))
			System.out.println(s1 + " and " + s2+ " are Anagrams");
		else
			System.out.println(s1 + " and " + s2+ " are Not Anagrams");
		scanner.close();
	}
	public static boolean checkAnagram(String s1 , String s2)
	{
		s1 = s1.replaceAll("s", "");
		s2 = s2.replaceAll("s", "");
		if(s1.length() != s2.length())
			return false;
		else
		{
			char[] array1 = s1.toLowerCase().toCharArray();
			char[] array2 = s2.toLowerCase().toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			return (Arrays.equals(array1, array2));
		}
	}
}
