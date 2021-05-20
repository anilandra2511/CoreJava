package com.ojas.assignments;
import java.util.Scanner;
public class ECC_34_PrimeNumbersSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Min and Max range of Prime nubers :");
		int min = sc.nextInt();
		int max = sc.nextInt();
		System.out.println(getPrimeNumbersSum(min,max));
	}
	
	static int getPrimeNumbersSum(int low, int high)
	{
		int res = 0;
		if(low > 0 && high > 0)
		{
			if(low < high)
			{
				System.out.println("\nThe Prime numbers between "+low+" and "+high+" are as follows...");
				for(int i = (low+1) ; i < high ; i++)
				{
					if(isPrime(i))
					{
						System.out.print(i+" ");
						res += i;
					}
				}
				System.out.print("and their SUM is ");
			}
			else
				res += -3;
		}
		else if(low == 0 || high == 0)
			res += -2;
		else
			res += -1;
		return res;
	}
	
	static boolean isPrime(int num) 
	{
        if (num < 2) 
        	return false;
        int i = 2,count = 0;
		while(i < num)
		{
			if(num%i == 0)
			{
				count++;
				break;
			}
			i++;
		}
		if(count == 0)
			return true;
		else
			return false;
	}

}
