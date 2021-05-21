package com.ojas.strings;

import java.util.Scanner;

public class ECC58_ColumnSum 
{
	public static void main(String[] args)
	{
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements into the 3 X 3 Matrix(9 elements) : ");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 3 X 3 Matrix elements are : ");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++) 
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        int[] columnSum = getColumnSum(arr);
        System.out.println("\nColumn elements' Sum is :");
        for (int i = 0 ; i < 3 ; i++) 
        {
            System.out.print(columnSum[i]+" ");
        }
	}
	
	static int[] getColumnSum(int a[][])
	{
        int res[] = new int[3];
        for (int i = 0; i < 3; i++) 
        {
        	int k = 0;
            for (int j = 0; j < 3; j++)
            {
                res[k] += a[i][j];
                k++;
            }
        }
        return res;
    }

}
