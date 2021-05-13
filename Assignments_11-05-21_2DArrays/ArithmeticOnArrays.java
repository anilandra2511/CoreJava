package com.ojas.corejava;

public class ArithmeticOnArrays 
{

	public static void main(String[] args)
	{
		int arr1[][] = {{2,4,6},{8,10,12},{14,16,18}};
		int arr2[][] = {{1,3,5},{7,9,11},{13,15,17}};
	     sumOfArrays(arr1, arr2);
	     difOfArrays(arr1, arr2);
	     prodOfArrays(arr1, arr2);
	     divOfArrays(arr1, arr2);
	}
	
	static void sumOfArrays(int a[][],int b[][]) 
	{
		int c[][] = new int[3][3];
		 System.out.println("Sum of two dimensional arrays : ");
		 for(int i = 0;i < 3 ;i++) 
		 {
			 for(int j = 0; j < 3; j++)
			 { 
				 c[i][j]= a[i][j] + b[i][j];
				 System.out.print(c[i][j] + " ");
		       }
			 System.out.println();
	      } 
		
	}
	static void difOfArrays(int a[][],int b[][]) 
	{
		int c[][] = new int[3][3];
		 System.out.println(" \n Subtraction of two dimensional arrays : ");
		 for(int i = 0;i < 3 ;i++)
		 {
			 for(int j = 0; j < 3; j++)
			 { 
				 c[i][j]= a[i][j] - b[i][j];
				 System.out.print(c[i][j] + " ");
		       }
			 System.out.println();
	      } 
		
	}
	static void prodOfArrays(int a[][],int b[][]) 
	{
		int c[][] = new int[3][3];
		 System.out.println(" \n Multplication of two dimensional arrays : ");
		 for(int i = 0;i < 3 ;i++)
		 {
			 for(int j = 0; j < 3; j++) 
			 { 
				 c[i][j]= a[i][j] * b[i][j];
				 System.out.print(c[i][j] + " ");
		       }
			 System.out.println();
	      } 
	}
	static void divOfArrays(int a[][],int b[][]) 
	{
		int c[][] = new int[3][3];
		 System.out.println(" \n Division of two dimensional arrays : ");
		 for(int i = 0;i < 3 ;i++)
		 {
			 for(int j = 0; j < 3; j++)
			 { 
				 c[i][j]= a[i][j] / b[i][j];
				 System.out.print(c[i][j] + " ");
		       }
			 System.out.println();
	      } 
	}


}
