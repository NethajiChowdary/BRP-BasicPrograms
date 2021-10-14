package com.bridgelabz.day5;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of times you want to flip a coin: ");
		int numberofFlips = scanner.nextInt();
		scanner.close();
		if (numberofFlips <= 0)
		{
			System.out.println("Please enter Positive Integer");
		}
		else
		{
			int numberofHeads =0;
			for (int i = 0; i<numberofFlips;i++)
			{
				if(Math.random()>0.5)
				{
					numberofHeads++;
					System.out.println(numberofHeads);
				}
			}
			double percentofHeads = (numberofHeads*100)/numberofFlips;
			double percentofTails = 100-percentofHeads;
			System.out.println("Heads Percentage : " +percentofHeads);
			System.out.println("Tails Percentage : " +percentofTails);
		}
	}

}
