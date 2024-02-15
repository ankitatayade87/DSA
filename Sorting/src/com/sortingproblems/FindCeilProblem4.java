package com.sortingproblems;

import java.util.Scanner;

public class FindCeilProblem4 {
	
	public static int findCeiling(int[] arr, int n, int x)
	{
		if(x <= arr[0])
		{
			return arr[0];
		}
		for(int i = 1; i < n-1; i++)
		{
			if(arr[i-1] < x && arr[i+1] > x)
			{
				return arr[i+1];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int size, x, ceil;
		
		System.out.println("Enter size of Arrays");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int []arr = new int[size];
		
		System.out.println("Enter Array Elements");
		
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
				
		x = sc.nextInt();
		ceil = findCeiling(arr, size, x);
		
		if(ceil != -1)
		{
			System.out.println("Ceil of "+x+ " is "+ceil);
		}
		else
		{
			System.out.println("Ceil does not exist");
		}
	}
}
