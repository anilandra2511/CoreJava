package com.ojas.strings;

import java.util.Scanner;

public class ECC60_SearchInMatrix
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of Rows and Columns:");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];
		System.out.println("Enter the elements into the "+rows+" x "+cols+" Matrix");
		for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
		System.out.println("\nThe "+rows+" x "+cols+" Matrix elements are : ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Enter the element you want to search :");
        int search = sc.nextInt();
        System.out.println(isPresentInMatrix(arr,rows,cols,search));
	}
	
	static boolean isPresentInMatrix(int a[][],int row, int col, int ele)
	{
		boolean b = false;
		for (int i = 0 ; i < row ; i++) 
		{
			for (int j = 0  ; j < col; j++)
			{
				if (a[i][j] == ele) 
				{
		        	b = true;
				}
			}
		}
		return b;
	}

}
