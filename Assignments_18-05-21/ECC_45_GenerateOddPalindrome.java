package com.ojas.assignments;
import java.util.Scanner;
public class ECC_45_GenerateOddPalindrome 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Min and Max range :");
		int min = sc.nextInt();
		int max = sc.nextInt();
		System.out.println(getOddPalindromeList(min,max));
	}
	static String getOddPalindromeList(int first, int last)
	{
		String res="";
		
		if(first > last) 
		{
			res += "Error";
		}
		else if(first <= 0 || last <= 0) 
		{
			res += "Error";
		}
		else if(first < 100 || last > 999)
		{
			res += "Error";
		}
		else 
		{
			for(int i = first ; i <= last ; i++) 
			{
				if(isPalindrome(i) % 2 != 0) 
				{
					res += i+" ";
				}
			}
		}
		return res;
	}
	static int isPalindrome(int num)
	{
		int rem,temp = num,res = 0;
		while(num > 0)
		{
			rem = num % 10;
			res = res * 10 + rem;
			num = num / 10;
		}
		if(res == temp) 
		{
			return temp;
		}
		else 
		{
			return 0;
		}
	}


}
