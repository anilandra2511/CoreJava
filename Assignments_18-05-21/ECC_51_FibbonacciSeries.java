package com.ojas.assignments;
import java.util.Scanner;
public class ECC_51_FibbonacciSeries
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of series : ");
		int n = sc.nextInt();
		System.out.println("Fibonacci series are " + getFibonacciSeries(n));
	}

	static String getFibonacciSeries(int num) 
	{
		String res  = "";
		int num1 = 0,  num2 = 1, sum = num1 + num2;
		
		if(num == 1)
		{
			res += num1 + " ";
		}
		else
		{
			res += num1 + " ";
			res += num2 + " ";
		}
		
		for(int i = 3;i <= num;i++)
		{
			res += sum + " ";
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}		
		return res;
	}
}
