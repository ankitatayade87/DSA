package com.sortingproblems;

import java.util.Scanner;

/*
 * 	Searching in an array where adjacent differ by at most k
 */
public class SearchArrayElementAdjacentDifferByK {
		
	public static int SearchArrayElement(int[] arr, int k, int x)
	{
		int i = 0;
		
		while(i < arr.length)
		{
			if(arr[i] == x)
			{
				return i;
			}
			
			i = i + Math.max(1, Math.abs((arr[i] - x) / k));
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int size, k, x;
		
		System.out.println("Enter size of Arrays");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		System.out.println("Enter value of x");
		x = sc.nextInt();
		
		System.out.println("Enter value of k");
		k = sc.nextInt();
		
		int []arr = new int[size];
		
		System.out.println("Enter Array Elements");
		
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int index = SearchArrayElement(arr, k, x);
		
		if(index != -1)
		{
			System.out.println("The element is at index "+ index);
		}
		else
		{
			System.out.println("Element is not present.");
		}
	}

}
