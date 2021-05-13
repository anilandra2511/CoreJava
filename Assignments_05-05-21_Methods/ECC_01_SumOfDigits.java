package com.ojas.methods;

import java.util.Scanner;

public class ECC_01_SumOfDigits
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("\nThe result is "+getSumOfDigits(num));
	}
	
	static int getSumOfDigits(int givenNum)
	{
		int res = 0;
		if(givenNum >= 10 && givenNum <= 99)
		{
			int rem = givenNum % 10;
			int coe = givenNum / 10;
			 res = coe + rem ;
		}
		else if(givenNum >= 0 && givenNum <= 9)
			res = -1;
		else if(givenNum > 99)
			res = -2;
		else if(givenNum < 0)
			res = -3;
		return res;
	}

}
