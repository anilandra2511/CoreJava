package com.ojas.strings;

import java.util.Scanner;

public class MaskedEmailID {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an email address: ");
		String emailID = sc.next();
		System.out.println(getMaskedMail(emailID));
	}
	
	static String getMaskedMail(String email){
		
		String res = "";
		StringBuffer sb = new StringBuffer(email);
		for (int i = 2; i < sb.length() && (sb.charAt(i) != '@') ; i++){
			
		  sb.setCharAt(i, '*');
		}
		email = sb.toString();
		res += "\nThe masked email address is \n"+ email;
		
		return res;
	}

}
