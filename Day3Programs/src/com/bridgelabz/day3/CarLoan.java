package com.bridgelabz.day3;

import java.util.Scanner;

public class CarLoan {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double P, Y, R , payment;
		System.out.println("Enter Loan Amount : ");
		P = scanner.nextDouble();
		System.out.println("Enter Year : ");
		Y = scanner.nextDouble();
		System.out.println("Enter Rate : ");
		R = scanner.nextDouble();
		scanner.close();
		double div , n = 12*Y, r = R/(12 * 100);
		div = (1 -Math.pow((1 + r), (-n)));
		payment = (P * r) / div;
		double interest = payment * n - P;
		System.out.println("Interest Rate Per Month : " +r);
		System.out.println("Loan Period in Months : " +n);
		System.out.println("Monthly Payments : " +payment);
		System.out.println("Total Interest : " +interest);
	}

}
