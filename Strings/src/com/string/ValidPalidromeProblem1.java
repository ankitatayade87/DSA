package com.string;

import java.util.Scanner;

public class ValidPalidromeProblem1 {

	public static boolean isPalidrome(String str)
	{
        if (str.isEmpty())
        {
        	return true;
        }
        
        int start = 0;
        int last = str.length() - 1;
        
        while(start <= last)
        {
        	char currFirst = str.charAt(start);
        	char currLast = str.charAt(last);
        	
        	if (!Character.isLetterOrDigit(currFirst )) 
        	{
        		start++;
        	} 
        	else if(!Character.isLetterOrDigit(currLast)) 
        	{
        		last--;
        	} 
        	else 
        	{
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast))
        		{
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
		
	}
	public static void main(String[] args) {
		
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		str= sc.nextLine(); 
		
		if(isPalidrome(str))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
