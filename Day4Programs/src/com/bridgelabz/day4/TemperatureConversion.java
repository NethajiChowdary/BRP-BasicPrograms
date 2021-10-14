package com.bridgelabz.day4;

import java.util.Scanner;

public class TemperatureConversion 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double choice, celsius_fahrenheit , fahrenheit_celsius,c,f;
		System.out.println("Enter the Choice for Temperature 1- Celsius 2- Fahrenheit");
		choice = scanner.nextDouble();
		if (choice ==1) {
			System.out.println("Enter the Temperature in Celsius: ");
			c = scanner.nextDouble();
			celsius_fahrenheit = (c * 9/5) + 32;
			System.out.println("Celsius to Fahrenheit is : " +celsius_fahrenheit);
		}
		else {
			System.out.println("Enter the Temperature in Fahrenheit: ");
			f = scanner.nextDouble();
			fahrenheit_celsius = (f - 32) * 5/9;
			System.out.println("Fahrenheit to Celsius is : " +fahrenheit_celsius);
		}
		scanner.close();
	}

}
