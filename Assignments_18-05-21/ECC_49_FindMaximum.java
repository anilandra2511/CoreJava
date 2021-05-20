package com.ojas.assignments;
import java.util.Scanner;
public class ECC_49_FindMaximum
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements into the Array :");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMax(arr));
	}
	
	static int findMax(int arr[]) 
	{
        int max = 0;
        int count = 0;
        if(arr == null)
        {
            max = 0;
        }
        else
        {
            for(int i = 0 ; i < arr.length ; i++)
            {
                if(arr[i] < 0) 
                {
                    count++;
                }
                else if(max < arr[i]) 
                {
                    max = arr[i];
                }
            }
        
            if(count < 3) {
                max = -1;
            }
        }
        
        return max;
    }

}
