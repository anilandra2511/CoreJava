package com.ojas.methods;

import java.util.Scanner;

public class ECC_09_SignFinder
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("\nThe result is "+findSign(num));
	}
	
	static int findSign(int givenNum)
	{
		int res = 0;
		if(givenNum > 0)
			res = 1;
		else if(givenNum < 0)
			res = -1;
		else
			res = 0;
		return res;
	}

}
