package com.ojas.methods;

import java.util.Scanner;

public class ECC_13_RoundedSum 
{

	public static void main(String[] args)
	{
		System.out.println("Enter three numbers : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("\nThe result is "+sumOfRoundedValues(num1,num2,num3));
	}
	
	static int roundValue(int number)
	{
		int rem = number%10;
		if(rem < 5)
		{
			int total = 0;
			total = number / 10;
			total *= 10;
			return total;
		}
		else
		{
			int total = 0;
			total = number / 10;
			total = (total + 1) * 10;
			return total;
		}
	}
	
	static int sumOfRoundedValues(int first,int second,int third)
	{
		if(first > 0 && second > 0 && third > 0)
		{
			return roundValue(first) + roundValue(second) + roundValue(third);
		}
		else
			return -1;
	}
	
	

}
