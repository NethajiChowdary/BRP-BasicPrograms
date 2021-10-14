package com.bridgelabz.day10;

import java.util.Scanner;

public class Collinear 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values of x1,x2,x3,y1,y2,y3: ");
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int y3 = scanner.nextInt();
		MathFunction.collinear(x1,x2, x3, y1, y2, y3);
		scanner.close();
	}

}
