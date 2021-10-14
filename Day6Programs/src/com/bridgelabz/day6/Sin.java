package com.bridgelabz.day6;

import java.util.Scanner;

public class Sin
{
	static void calculateSin(float n)
	{
		float accuracy = (float) 0.0001, denominator, sinn, sinvalue;
		n = n * (float)(3.142 / 180.0);
		float n1 =n;
		sinn = n;
		sinvalue = (float)sinn;
		int i =1;
		do
		{
			denominator = 2 * i * (2 * i +1);
			n1 = -n1 * n *n / denominator;
			sinn = sinn + n1;
			i = i +1;
		}
		while ( accuracy <= sinvalue - sinn);
		System.out.println(sinn);
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Angle in Degree : ");
		float n = scanner.nextFloat();
		calculateSin(n);
		scanner.close();
	}

}
