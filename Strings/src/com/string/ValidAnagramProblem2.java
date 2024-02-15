package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagramProblem2 {
	
	public static boolean isValidAnagram(String s, String t)
	{
		char[] str1 = s.toCharArray();
		char[] str2 = t.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		return Arrays.equals(str1, str2);
	}
	public static void main(String[] args) {
		
		String str1, str2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String1");
		str1= sc.nextLine(); 
		System.out.println("Enter String2");
		str2= sc.nextLine(); 
		
		if(isValidAnagram(str1, str2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
