package com.ojas.arrays;

import java.util.Scanner;

public class SearchingFromTen
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
		System.out.println("Enter a number to search : ");
		int number = sc.nextInt();
		System.out.println(number + " is found at the INDEX " + getPosition(number,values) );
	}
	
	static int getPosition(int  val, int values[] )
	{
		int res = 0;
		for( int i = 0 ; i < values.length ; i++)
		{
			if(val == values[i])
				res += (i+1);
		}
		return res ;
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
}
