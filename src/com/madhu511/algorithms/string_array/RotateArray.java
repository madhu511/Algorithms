package com.madhu511.algorithms.string_array;

import java.util.Arrays;

public class RotateArray {

	public static void main( String args[])
	{
		int nums[] = {1,2,3,4,5,6,7}, k = 3;
		//rotate - Method 1
		rotate1(nums,k);
		rotate2(nums,k);
		rotate3(nums,k);
	}
	public static void rotate1( int []nums, int k)
	{
		if ( k > nums.length)
			k = k%nums.length;
		int res[] = new int[nums.length];
		for(int i=0; i < k ; i++)
		{
			//decrement of array index
			res[i] = nums[nums.length-k+i];
		}
		int j = 0;
		for(int i=k; i<nums.length; i++)
		{
			res[i] = nums[j++];
		}
		System.out.println(Arrays.toString(nums));
		System.arraycopy(res, 0, nums, 0, nums.length);
		System.out.println(Arrays.toString(nums));
	}
	public static void rotate2( int []nums, int k)
	{
		
	}
	public static void rotate3( int []nums, int k)
	{
		
	}
}
