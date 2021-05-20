package com.ojas.assignments;
import java.util.Scanner;
public class ECC_44_GeneratePalindrome 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		System.out.println(getPalindromeList(num));
	}

	static String getPalindromeList(int n)
	{
		String output = "";
		if(n <= 0)
		
		{
			return "Error";
		}
		else if(n < 100 || n > 999)
		{
			return "Error";
		}
		else if(n >= 100 || n <= 999) 
		{
			int temp, r, rev=0, sum;
			temp=n;
	        output = output + temp ;
	        while(n > 0) 
	        {
	            r = n % 10;
	            rev = rev * 10 + r;
	            n = n / 10;
	        }
	        if(rev == temp)
	            return output;
	        output = output + "," + rev + ",";
	        sum = temp + rev;
	        return getPalindromeList(sum);
		}
		else
		{
			return "Error";
		}
		
	}
}
