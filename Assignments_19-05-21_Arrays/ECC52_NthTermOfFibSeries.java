package com.ojas.strings;
import java.util.Scanner;
public class ECC52_NthTermOfFibSeries
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth term : ");
		int n = sc.nextInt();
		System.out.println(getNthTermOfFibonacciSeries(n));
	}

	static int getNthTermOfFibonacciSeries(int nth) 
	{
		int a = 0, b = 1;
		if (nth <= 0) 
		{
            return -1;
        }
		        
        for (int i = 0; i < nth - 1; i++)
        {
            int c = a + b;
            a = b;
            b = c;
        }
 
        return b;
    }
}
