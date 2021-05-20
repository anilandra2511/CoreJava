package com.ojas.assignments;
import java.util.Scanner;
public class ECC_39_OccurrenceCounter 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of elements in the Array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
        System.out.println("Enter the array elements ? ");
        for (int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the search element ?");
        int find = sc.nextInt();
        
        System.out.println(getCount(nums , find));
	}
	
	static int getCount(int numbers[], int search) 
	{
        int res = 0, count = 0;
        
        if(numbers.length == 0) 
        {
            res = -1;
        }
        else 
        {
            for (int i = 0 ; i < numbers.length ; i++)
            {
                if(search == numbers[i]) 
                {
                    count++;
                    res = count;
                }
            }
        }
        System.out.println("The numbers of times");
        return res;
    }


}
