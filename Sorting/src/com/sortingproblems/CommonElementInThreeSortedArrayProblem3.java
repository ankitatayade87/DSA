package com.sortingproblems;
/*
 * Find common elements in three sorted arrays
 */

import java.util.Scanner;

public class CommonElementInThreeSortedArrayProblem3 {
	
	public static void findCommonElement(int []arr1, int []arr2, int[] arr3)
	{
		int n1, n2, n3;
		
		n1 = arr1.length;
		n2 = arr2.length;
		n3 = arr3.length;
		
		int i = 0 , j = 0, k = 0;
		
		while( i < n1 && j < n2 && k < n3)
		{
			if(arr1[i] == arr2[j] && arr2[j] == arr3[k])
			{
				System.out.println("Common element is "+arr1[i]);
				i++;
				j++;
				k++;
			}
			else if(arr1[i] < arr2[j])
			{
				i++;
			}
			else if(arr2[j] < arr3[k])
			{
				j++;
			}
			else
			{
				k++;
			}
		}
	}

	public static void main(String[] args) {
		
		int size1, size2, size3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array1");
		size1 = sc.nextInt();
		
		System.out.println("Enter size of Array2");
		size2 = sc.nextInt();

		System.out.println("Enter size of Array3");
		size3 = sc.nextInt();
		
		int []arr1 = new int[size1];
		int []arr2 = new int[size2];
		int []arr3 = new int[size3];
		
		System.out.println("Enter Array1 Elements");
		
		for(int i = 0; i < size1; i++)
		{
			arr1[i] = sc.nextInt();
		}
	
		System.out.println("Enter Array2 Elements");
		
		for(int i = 0; i < size2; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Enter Array3 Elements");
		
		for(int i = 0; i < size3; i++)
		{
			arr3[i] = sc.nextInt();
		}
		
		findCommonElement(arr1, arr2, arr3);
	}
}
