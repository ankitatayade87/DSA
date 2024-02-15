package com.sortingproblems;

import java.util.Scanner;

public class FindGivenPairDiffProblem6 {
	
	public static void findPairDiff(int []arr, int x)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(i == j)
				{
					continue;
				}
				
				if(arr[i] - arr[j] == x)
				{
					System.out.println("Pair is" +arr[i]+ ", " +arr[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int size, x;
		
		System.out.println("Enter size of Arrays");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int []arr = new int[size];
		
		System.out.println("Enter Array Elements");
		
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter value of x");
		x = sc.nextInt();
		
		findPairDiff(arr, x);
	}
}
