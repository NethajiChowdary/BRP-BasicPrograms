package com.bridgelabz.day6;

import java.util.Scanner;

public class Cos
{

		static void calculateCos(float n)
		{
			float accuracy = (float) 0.0001, denominator, cosn, cosvalue;
			n = n * (float)(3.142 / 180.0);
			float n1 =n;
			cosn = n;
			cosvalue = (float)cosn;
			int i =1;
			do
			{
				denominator = 2 * i * (2 * i +1);
				n1 = -n1 * n *n / denominator;
				cosn = cosn + n1;
				i = i +1;
			}
			while ( accuracy <= cosvalue - cosn);
			System.out.println(cosn);
		}
		public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Angle in Degree : ");
			float n = scanner.nextFloat();
			calculateCos(n);
			scanner.close();
		}

	

}
