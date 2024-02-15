 package com.sortingproblems;

import java.util.Scanner;

public class MajorityElementProblem7 {
	
	public static void findMajorityElement(int []arr, int n)
	{
		int maxcount = 0, count = 0, index = 0;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}				
			}			
			if(count > maxcount)
			{
				maxcount = count;
				index = i;
			}
		}
		if(maxcount > n/2)
		{
			System.out.println("Majority element is " +arr[index]);
		}
		else
		{
			System.out.println("Element not present.");
		}		
	}

	public static void main(String[] args) {
		
	int size;
		
	System.out.println("Enter size of Arrays");
	Scanner sc = new Scanner(System.in);
	size = sc.nextInt();
	
	int []arr = new int[size];
	
	System.out.println("Enter Array Elements");
	
	for(int i = 0; i < size; i++)
	{
		arr[i] = sc.nextInt();
	}
		
	findMajorityElement(arr, arr.length);
	
	}
}
