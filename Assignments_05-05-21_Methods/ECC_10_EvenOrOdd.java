package com.ojas.methods;

import java.util.Scanner;

public class ECC_10_EvenOrOdd 
{

	public static void main(String[] args)
	{
		System.out.println("Enter a number to check:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("\n"+isEvenOrOdd(num));
	}

	static String isEvenOrOdd(int givenNum)
	{
		String res = "";
		if(givenNum > 0)
		{
			if(givenNum % 2 == 0)
				res = "EVEN";
			else
				res = "ODD";
		}
		else
			res = "Invalid Input";
		return res;
	}
}