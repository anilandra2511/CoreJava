package com.ojas.strings;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings ");
		String str1 = sc.next();
		String str2 = sc.next();
		isAnagram(str1,str2);	
	}
	
	static void isAnagram(String str1, String str2)
	{   
        boolean status = true;  
        if (str1.length() != str2.length())
        {  
            status = false;  
        } 
        else
        {  
            char[] ArrayS1 = str1.toLowerCase().toCharArray();  
            char[] ArrayS2 = str2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if(status)
        {  
            System.out.println(str1 + " and " + str2 + " are Anagrams");  
        } 
        else 
        {  
            System.out.println(str1 + " and " + str2 + " are not Anagrams");  
        }  
    }  

}
