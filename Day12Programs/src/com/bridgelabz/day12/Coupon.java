package com.bridgelabz.day12;

import java.util.Scanner;

public class Coupon
{
	public static int randomNumber(int range)
	{
		return(int) (Math.random() * range);
	}
	public static int distinctCoupon(int range)
	{
		boolean[] array = new boolean[range];
		int count = 0, distinct =0;
		while(distinct < range)
		{
			int value = randomNumber(range);
			System.out.println(value + " ");
			if (!array[value])
			{
				distinct ++;
				array[value] = true;
				System.out.println(array[value] + " ");
			}
			count++;
		}
		for(int i =0; i < array.length; i++)
		{
			System.out.println("index " + i + " values are " + array[i] + "\n");
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number to Generate the Coupons: ");
		int range = scanner.nextInt();
	    int count = Coupon.distinctCoupon(range);
	    System.out.println(count + " times loop runs for finding distinct");
		scanner.close();
	}

}
