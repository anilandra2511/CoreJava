package com.ojas.methods;

import java.util.Scanner;

public class ECC_08_OddRounder
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("\nThe result is "+oddRounder(num));
	}
	
	static int oddRounder(int givenNum)
	{
		int res = 0;
		if(givenNum > 0)
		{
			if(givenNum % 2 == 0)
				res = givenNum;
			else
			{
				int total =0;
				total = givenNum/10;
				total = (total +1)*10;
				res = total;
			}
		}
		else if(givenNum < 0)
			res = -1;
		else if(givenNum == 0)
			res = -2;
		return res;
	}

}
