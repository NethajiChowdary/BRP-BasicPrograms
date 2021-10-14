package com.bridgelabz.day7;

import java.util.Scanner;

public class SwapNibbles 
{
	static int swapNibbles(int decimal)
	{
		return ((decimal & 0x0F) << 4 | (decimal & 0xF0) >> 4);
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int binary = 0, remainder , temp = 1;
		System.out.println("Enter a Decimal Number : ");
		int decimal = scanner.nextInt();
		System.out.println("After Swap Nibble : " +swapNibbles(decimal));
		scanner.close();
		while (decimal != 0)
		{
			remainder = decimal % 2;
			decimal = decimal / 2;
			binary = binary + remainder * temp;
			temp = temp * 10;
		}
		System.out.println("The Binary Number is : " +binary);
	}

}
