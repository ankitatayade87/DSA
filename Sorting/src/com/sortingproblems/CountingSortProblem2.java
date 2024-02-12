package com.sortingproblems;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSortProblem2 {
	
	public static void CountingSort(int []arr, int n)
	{
		//Step 1: Find max element
		int max = 0;
		for(int i = 0; i < n; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		//Step 2: Assign countArray of size max+1
		int []countArr = new int[max+1];
		
		Arrays.fill(countArr,0);
		
		//Step 3: Fill countArr
		for(int i = 0; i < n; i++)
		{
			countArr[arr[i]] += 1;
		}
		
		//Step 4: Accumulative sum
		for(int i = 1; i <= max; i++)
		{
			countArr[i] += countArr[i-1];
		}
		
		//Step 5: Assign new Output array of same size of input array-> SC: O(n)
		int []outArr = new int[n];
		
		//Step 6: fill outArr by comparing countArr
		for(int i = 0; i < n; i++)
		{
			outArr[countArr[arr[i]] - 1] = arr[i];
			countArr[arr[i]]--;
		}
		
		for(int i = 0; i < n; i++)
		{
			System.out.println(outArr[i]);
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
		
		CountingSort(arr, arr.length);
	}
}
