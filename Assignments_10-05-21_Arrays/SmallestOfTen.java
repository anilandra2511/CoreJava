package com.ojas.arrays;

import java.util.Scanner;

public class SmallestOfTen 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ten values : ");
		int values[] = new int[10];
		for(int i = 0 ; i < values.length ; i++)
		{
			values[i] = sc.nextInt();
		}
		displayNum(values);
		System.out.println("\nand The Smallest value is  "+getSmallest(values));
	}
	
	static void displayNum(int nums[])
	{
		System.out.println("The given values are :");
		for(int i = 0 ; i < nums.length ; i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
	
	static int getSmallest(int numbers[])
	{
		int res = numbers[0];
		for(int i = 0; i < numbers.length;i++)
		{
			if(numbers[i] < res)
			{
				res = numbers[i];
			}
		}
		return res;
	}

}
