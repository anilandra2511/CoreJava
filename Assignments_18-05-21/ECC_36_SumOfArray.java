package com.ojas.assignments;
import java.util.Scanner;
import java.util.Arrays;
public class ECC_36_SumOfArray 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array:");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements :");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(getArraySum(arr));
	}
	
	static int getArraySum(int arr[]) 
	{
        Arrays.sort(arr);
        int temp = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            
            if(arr[i] > 0)
            {
                if (arr[i] == temp)
                {
                    continue;
                } 
                else 
                {
                    sum += arr[i];
                }
                temp = arr[i];
            }
            else if(arr.length == 0)
            {
                sum = -1;
                break;
            } 
            else if(arr[i] < 0)
            {
                sum = -2;
                break;
            } 
            
        }
        return sum;
    }
}


