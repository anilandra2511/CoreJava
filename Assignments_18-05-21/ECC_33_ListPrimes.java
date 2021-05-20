package com.ojas.assignments;
import java.util.Scanner;
public class ECC_33_ListPrimes 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Min and Max range of Prime nubers :");
		int min = sc.nextInt();
		int max = sc.nextInt();
		System.out.println(getPrimeNumbers(min,max));
	}
	
	static String getPrimeNumbers(int low, int high)
	{
		String res = "";
		if(low >= 0 && high >= 0)
		{
			if(low < high)
			{
				System.out.println("\nThe Prime numbers between "+low+" and "+high+" are as follows...");
				for(int i = (low+1) ; i < high ; i++)
				{
					if(isPrime(i))
					{
						res += i+" ";
					}
				}
			}
			else
				res += -2;
		}
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
