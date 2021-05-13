package com.ojas.methods;

import java.util.Scanner;

public class ECC_03_MultipleOf100
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("\nThe result is "+getNextMultipleOf100(num));
	}
	
	static int getNextMultipleOf100(int givenNum)
	{
		int res = 0;
		if(givenNum >100)
		{
			int total = givenNum/100;
			total = (total + 1) * 100;
			res = total;
		}
		else if(givenNum < 100 && givenNum > 0)
			res = 100;
		else if(givenNum <= 0)
			res = -1;
		
		return res;
	}

}
