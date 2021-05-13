package com.ojas.methods;

import java.util.Scanner;

public class ECC_05_EvenFinder
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("\nThe result is "+isEven(num));
	}
	
	static int isEven(int givenNum)
	{
		int res = 0;
		if(givenNum >0)
		{
			if(givenNum % 2 == 0)
				res = 1;
			else
				res = 0;
		}
		else
			res = -1;
		return res;
	}

}
