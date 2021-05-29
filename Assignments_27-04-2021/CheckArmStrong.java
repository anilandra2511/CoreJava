package com.ojas.basicprograms;
import java.util.*;
public class CheckArmStrong
{
	public static void isArmstrong(int num)
	{
		int temp,r,total = 0;
        temp =num;
        if( num<0 || num<1000 || num>=10000 )
           {
        	System.out.println("String ERROR");
           }
          else
          { 
             while (num != 0)
              {
                r = num % 10;
                total = total + r*r*r*r;
                num=num / 10;
               }
              if(total == temp)
              { System.out.println(temp + " is an Armstrong number");}
              else
              { System.out.println(temp + " is not an Armstrong number");}
            }     
	}

	public static void main(String[] args)
	{
		System.out.println("Enter a 4-digit number to check : ");
        Scanner s = new Scanner(System.in);
        try 
        {
          int n=s.nextInt();
          isArmstrong(n);
          s.close();     
        }catch(Exception e)
        {
        	System.out.println("System ERROR");
        }
    }

}
