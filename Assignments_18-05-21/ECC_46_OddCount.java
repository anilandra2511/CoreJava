package com.ojas.assignments;
import java.util.Scanner;
public class ECC_46_OddCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements into array");
		for(int i = 0 ;i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ;i < n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nOddCount is: " + getOddCount(arr));
	}
	
	static int getOddCount(int[] arr)
	{
		int res = 0;
		int even = 0;
		if(arr.length != 5)
		{
			res += -1;
		}
		else if(arr == null)
		{
			res += -4;
		}
		else 
		{
			for(int i = 0; i < arr.length;i++)
			{
				if(arr[i] <= 0) 
				{
					res = -2;
					break;
				}
				else if(arr[i] % 2 == 0)
				{
					even++;
				}
				else 
				{
					res += (res + 1);
				}
			}
			if(even == arr.length)
			{
				res += -3;
			}
		}
		return res;
	}

}
