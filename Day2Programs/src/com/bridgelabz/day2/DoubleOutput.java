package com.bridgelabz.day2;

import java.util.Scanner;

public class DoubleOutput
{
	public static void main(String[] args)
	 { 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the values of a,b,c");
		 double a = scanner.nextDouble();
		 double b = scanner.nextDouble();
		 double c = scanner.nextDouble();
		 scanner.close();
		 
		 double num1 = a + b * c;
		 double num2 = a * b + c;
		 double num3 = c + a / b;
		 double num4 = a % b + c;
		 System.out.println("a + b * c =" +num1);
		 System.out.println("a * b + c =" +num2);
		 System.out.println("c + a / b =" +num3);
		 System.out.println("a % b + c =" +num4);
	 } 
}
