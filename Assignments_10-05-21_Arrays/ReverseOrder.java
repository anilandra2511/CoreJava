package com.ojas.arrays;

import java.util.Scanner;

public class ReverseOrder 
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
		System.out.println("\nThe values in the reverse order are :\n"+ reverseOrdering(values));
	}
	
	static void displayNum(int nums[])
	{
		System.out.println("The given values are :");
		for(int i = 0 ; i < nums.length ; i++)
		{
			System.out.print(nums[i]+" ");
		}
		System.out.println("\n");
	}
	
	static String reverseOrdering(int values[])
	{
		String res = "";
		for(int i = (values.length - 1)  ; i >= 0 ; i--)
		{
			res += values[i]+" ";
		}
		return res;
	}

}
