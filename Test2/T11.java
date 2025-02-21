package com.Test2; 
// Program to calculate the geometric mean
// of the given array elements.
import java.math.*;

class T11{
		
	static float geometricMean(int arr[], int n)
	{
		
		float product = 1;


		for (int i = 0; i < n; i++)
			product = product * arr[i];

	
		float gm = (float)Math.pow(product, (float)1 / n);
		return gm;
	}

	public static void main(String args[])
	{
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = arr.length ;
		System.out.println(geometricMean(arr, n));
	}
}

