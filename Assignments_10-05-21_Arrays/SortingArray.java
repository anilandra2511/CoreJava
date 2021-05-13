package com.ojas.arrays;

import java.util.Scanner;

public class SortingArray 
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
		System.out.println("\nAfter sorting, the values are :\n"+ sortedValues(values));
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
	
	static String sortedValues(int numbers[])
	{
		String res ="";
		for (int i = 0; i < numbers.length; i++)   
		{  
			for (int j = i + 1; j < numbers.length; j++)   
			{  
				int temp = 0;  
				if (numbers[i] > numbers[j])   
				{  
					temp = numbers[i];  
					numbers[i] = numbers[j];  
					numbers[j] = temp;  
				}  
			}   
			res += numbers[i]+" ";
		}  
		return res;
	}

}
