package com.ojas.assignments;
import java.util.Scanner;
public class ECC_47_OddSum
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter " + a.length + " values into Array");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
		}
		for(int i = 0 ;i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nOdd Numbers' Sum is "+getOddSum(a));
	}
	
	static int getOddSum(int a[]) 
	{
		int res = 0;
		int sum = 0;
		if (a == null)
		{
			res = -4;
		}
		else 
		{
			int count = 0;
			for (int i = 0; i < a.length; i++) 
			{
				if (a[i] <= 0) 
				{
					res = -2;
					break;
				}

				else 
				{
					if (a[i] % 2 != 0)
					{
						sum += a[i];
						count++;
					}
				}
			}
			if (count == 0)
			{
				res = -3;
			} 
			else 
			{
				res = sum;
			}
		}
		return res;
	}
}
