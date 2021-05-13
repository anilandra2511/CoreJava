package com.ojas.methods;

import java.util.Scanner;

public class ECC_06_GreatestNumber 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter two numbers : ");
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		System.out.println("\nThe result is "+getGreatest(first,second));
	}
	
	static int getGreatest(int num1,int num2)
	{
		int res = 0;
		if (num1 > 0 && num2 > 0)
		{
			if(num1 > num2)
				res = num1;
			else
				res = num2;
		}
		else if(num1 < 0 || num2 < 0)
			res = -1;
		else if(num1 == 0 || num2 == 0)
			res = -2;
		return res;
	}

}
