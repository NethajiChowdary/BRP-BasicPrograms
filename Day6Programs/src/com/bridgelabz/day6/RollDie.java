package com.bridgelabz.day6;

public class RollDie {

	public static void main(String[] args) 
	{
		int Sides = 6;
		int roll = (int) (Math.random() * Sides) + 1;
		System.out.println(roll);

	}

}
