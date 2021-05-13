package com.ojas.methods;

import java.util.Scanner;

public class ECC_11_Rounder 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("\n"+calculate(num));
	}
	
	static int calculate(int givenNum)
	{
		int res = 0;
		if(givenNum > 0)
		{
			if(givenNum % 2 == 0)
				res = givenNum * givenNum;
			else
				res = givenNum * givenNum * givenNum;
		}
		else
			res = -1;
		return res;
	}

}
