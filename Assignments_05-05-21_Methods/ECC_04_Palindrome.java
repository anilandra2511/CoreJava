package com.ojas.methods;

import java.util.Scanner;

public class ECC_04_Palindrome 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("\nThe result is "+isPalindrome(num));
	}
	
	static int isPalindrome(int givenNum)
	{
		int res = 0,rem,temp = givenNum, total =0;
		if(givenNum >= 100 && givenNum <= 999)
		{
			while(givenNum > 0)
				{
					rem = givenNum % 10;
					total = (total * 10) + rem;
					givenNum /= 10;
				}
			if(total == temp)
				res = 1;
			else
				res = 0;
		}
		else if(givenNum <= 0)
			res = -1;
		else
			res = -2;
		return res;
	}

}
