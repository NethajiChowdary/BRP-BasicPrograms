package com.bridgelabz.day3;

public class Stats5
{

	public static void main(String[] args) 
	{
		int n = 5;
		double n1 = Math.random();
		double n2 = Math.random();
		double n3 = Math.random();
		double n4 = Math.random();
		double n5 = Math.random();
		System.out.println("Random Number: " +n1);
		System.out.println("Random Number: " +n2);
		System.out.println("Random Number: " +n3);
		System.out.println("Random Number: " +n4);
		System.out.println("Random Number: " +n5);
		
		double min = Math.min(n1,Math.min(n2,Math.min(n3,Math.min(n4, n5))));
		double max = Math.max(n1,Math.max(n2,Math.max(n3,Math.max(n4, n5))));
		double average = (n1 + n2 + n3 + n4 + n5) / n;
		
		System.out.println("Average Value = " +average);
		System.out.println("Minimum Value = " +min);
		System.out.println("Maximum Value = " +max);

	}

}
