package com.sortingproblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * Given two arrays of equal size n and an integer k. 
 * The task is to permute both arrays such that sum of their corresponding element is greater than or equal to k 
 * i.e a[i] + b[i] >= k.
 * The task is to print “Yes” if any such permutation exists, otherwise print “No”.
 * 
 * Hint: arrange any of array in ascending or decending
 */
public class PermuteTwoArraysProblem1 {
	
	public static boolean IsConditionPossible(Integer []arr1, Integer []arr2, int k)
	{
		//Sort array1 in ascending
		Arrays.sort(arr1);
		
		//Sort array2 in decending
		Arrays.sort(arr2, Collections.reverseOrder());
		
		for(int i = 0; i < arr1.length; i++)
		{
			if(arr1[i] + arr2[i] >= k)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int size, k;
		
		System.out.println("Enter size of Arrays");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		Integer []arr1 = new Integer[size];
		Integer []arr2 = new Integer[size];
		
		System.out.println("Enter Array1 Elements");
		
		for(int i = 0; i < size; i++)
		{
			arr1[i] = sc.nextInt();
		}
	
		System.out.println("Enter Array2 Elements");
		
		for(int i = 0; i < size; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Enter value of k");
		k = sc.nextInt();
		
		if(IsConditionPossible(arr1, arr2, k))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
